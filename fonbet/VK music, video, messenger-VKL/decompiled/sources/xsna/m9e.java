package xsna;

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.location.Location;
import android.media.ExifInterface;
import android.net.Uri;
import android.os.Build;
import android.os.Debug;
import android.util.Size;
import com.ironsource.X3;
import com.unity3d.services.UnityAdsConstants;
import com.vk.clips.media.gallery.ClipsGalleryLoadException;
import com.vk.clips.media.stat.ClipsMediaStatController$StatErrorType;
import com.vk.core.serialize.Serializer;
import com.vk.dto.clips.ClipsVideoItemLocation;
import com.vk.dto.clips.gallery.ClipsProcessedItem;
import com.vk.dto.clips.gallery.TranscodingState;
import com.vk.media.MediaUtils;
import com.vk.media.pipeline.di.MediaPipelineComponent;
import com.vk.media.pipeline.model.item.VideoRawItem;
import com.vk.media.pipeline.model.quality.MediaQuality;
import com.vk.media.pipeline.model.source.picture.ImageFileMediaSource;
import com.vk.media.pipeline.model.timeline.Timeline;
import com.vk.media.pipeline.model.transform.TransformFormat;
import com.vk.stat.model.builders.clips.ClipsUploadErrorsEventBuilder;
import com.vkontakte.android.R;
import java.io.File;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.Callable;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.jvm.internal.Ref$ObjectRef;
import xsna.hpa0;
import xsna.ikv0;
import xsna.jbd;
import xsna.jbd.a;
import xsna.l3e0;
import xsna.lr10;

/* compiled from: ClipsGalleryProcessingUtils.kt */
/* loaded from: classes16.dex */
public final class m9e implements w8i {
    public static final Size h = new Size(1080, 1920);
    public final cmf b;
    public final cxd c;
    public final File d;
    public final Context e;
    public final irk0 f;
    public final Integer g;

    public m9e(cmf cmfVar, cxd cxdVar, File file, Context context, irk0 irk0Var, Integer num) {
        this.b = cmfVar;
        this.c = cxdVar;
        this.d = file;
        this.e = context;
        this.f = irk0Var;
        this.g = num;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v16, types: [android.location.Location] */
    /* JADX WARN: Type inference failed for: r0v19 */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r3v7, types: [android.location.Location] */
    public static ClipsProcessedItem a(m9e m9eVar, File file, TranscodingState transcodingState, Boolean bool, File file2) {
        ?? r0;
        String absolutePath = file.getAbsolutePath();
        Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        p490.z(new ga3(absolutePath, 1), new jb5(ref$ObjectRef, 8));
        MediaUtils.AudioConfig audioConfig = (MediaUtils.AudioConfig) ref$ObjectRef.element;
        String absolutePath2 = file.getAbsolutePath();
        long h2 = MediaUtils.a.h(file.getAbsolutePath());
        ClipsVideoItemLocation clipsVideoItemLocation = null;
        MediaUtils.AudioConfigLight audioConfigLight = audioConfig == null ? null : new MediaUtils.AudioConfigLight(audioConfig.b, audioConfig.c);
        if (file2 != null) {
            if (bool.booleanValue()) {
                r0 = MediaUtils.a.a(file2.getAbsolutePath());
            } else {
                Context context = m9eVar.e;
                Uri fromFile = Uri.fromFile(file2);
                try {
                    String path = fromFile.getPath();
                    if (path == null) {
                        Cursor query = context.getContentResolver().query(fromFile, new String[]{"_data"}, null, null, null);
                        try {
                            int columnIndexOrThrow = query.getColumnIndexOrThrow("_data");
                            query.moveToFirst();
                            String string = query.getString(columnIndexOrThrow);
                            s3q0 s3q0Var = s3q0.a;
                            query.close();
                            path = string;
                        } finally {
                        }
                    }
                    if (path != null) {
                        float[] fArr = new float[2];
                        new ExifInterface(path).getLatLong(fArr);
                        if (fArr[0] != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT || fArr[1] != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                            ?? location = new Location("EXIF_LOCATION");
                            location.setLatitude(fArr[0]);
                            location.setLongitude(fArr[1]);
                            clipsVideoItemLocation = location;
                        }
                    }
                } catch (Throwable unused) {
                }
                r0 = clipsVideoItemLocation;
            }
            Serializer.c<ClipsVideoItemLocation> cVar = ClipsVideoItemLocation.CREATOR;
            clipsVideoItemLocation = ClipsVideoItemLocation.a.a(r0);
        }
        return new ClipsProcessedItem(absolutePath2, h2, transcodingState, audioConfigLight, clipsVideoItemLocation, false, 32, null);
    }

    public static String b(boolean z) {
        StringBuilder b = v1v.b(z ? "photo" : "video", '_');
        b.append(UUID.randomUUID().getMostSignificantBits());
        b.append('_');
        b.append(System.currentTimeMillis());
        return b.toString();
    }

    public final io.reactivex.rxjava3.internal.operators.single.f0 c(final List list, l3e0 l3e0Var) {
        io.reactivex.rxjava3.internal.operators.single.k b;
        final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        final io.reactivex.rxjava3.subjects.f fVar = new io.reactivex.rxjava3.subjects.f();
        fVar.onNext(0);
        io.reactivex.rxjava3.internal.operators.single.k kVar = new io.reactivex.rxjava3.internal.operators.single.k(new io.reactivex.rxjava3.internal.operators.single.v(new Callable() { // from class: xsna.j9e
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r0v84 */
            /* JADX WARN: Type inference failed for: r0v85, types: [int] */
            /* JADX WARN: Type inference failed for: r0v98 */
            @Override // java.util.concurrent.Callable
            public final Object call() {
                AtomicBoolean atomicBoolean2;
                ArrayList arrayList;
                ClipsMediaStatController$StatErrorType clipsMediaStatController$StatErrorType;
                ClipsUploadErrorsEventBuilder.a aVar;
                File file;
                jbd jbdVar;
                boolean z;
                Pair pair;
                Integer num;
                int intValue;
                int i;
                Size size;
                Object obj;
                ivc u8dVar;
                String str;
                m9e m9eVar = this;
                File file2 = m9eVar.d;
                final Context context = m9eVar.e;
                int i2 = 2;
                lyd.a.d(Arrays.copyOf(new Object[]{"ClipsGalleryProcessingUtils", "processing gallery items..."}, 2));
                lyd.a.d(Arrays.copyOf(new Object[]{"ClipsGalleryProcessingUtils", "inputs: "}, 2));
                List<lr10> list2 = list;
                Iterator it = list2.iterator();
                boolean z2 = false;
                int i3 = 0;
                while (true) {
                    Object obj2 = null;
                    if (!it.hasNext()) {
                        jbd jbdVar2 = new jbd(new k9e(fVar, 0));
                        ArrayList arrayList2 = new ArrayList(c5g.u(list2, 10));
                        for (lr10 lr10Var : list2) {
                            if (lr10Var instanceof lr10.b) {
                                lyd.a.d(Arrays.copyOf(new Object[]{"ClipsGalleryProcessingUtils", "create copy task: " + lr10Var.a.getPath()}, i2));
                                cbr cbrVar = cbr.a;
                                String b2 = m9e.b(z2);
                                cbrVar.getClass();
                                u8dVar = new sds0(context, lr10Var.a, cbr.e(file2, b2, "mp4"));
                                file = file2;
                                jbdVar = jbdVar2;
                                obj = obj2;
                            } else {
                                if (!(lr10Var instanceof lr10.a)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                lr10.a aVar2 = (lr10.a) lr10Var;
                                jbd.a aVar3 = jbdVar2.new a();
                                jbdVar2.b.add(aVar3);
                                cbr cbrVar2 = cbr.a;
                                String b3 = m9e.b(true);
                                cbrVar2.getClass();
                                File e = cbr.e(file2, b3, "mp4");
                                ContentResolver contentResolver = context.getContentResolver();
                                File file3 = aVar2.a;
                                InputStream openInputStream = contentResolver.openInputStream(Uri.fromFile(file3));
                                if (openInputStream != null) {
                                    try {
                                        p4q p4qVar = new p4q(openInputStream);
                                        file = file2;
                                        int d = p4qVar.d(-1, "ImageWidth");
                                        jbdVar = jbdVar2;
                                        int d2 = p4qVar.d(-1, "ImageLength");
                                        if (d2 <= 0 || d <= 0) {
                                            try {
                                                Size a = ige.a(context, Uri.fromFile(file3));
                                                d = a.getWidth();
                                                d2 = a.getHeight();
                                            } catch (Throwable th) {
                                                z = false;
                                                lyd.a.g(th, Arrays.copyOf(new Object[0], 0));
                                                pair = null;
                                            }
                                        }
                                        if (p4qVar.e("Orientation") != null) {
                                            int d3 = p4qVar.d(0, "Orientation");
                                            if (d3 != 1) {
                                                if (d3 == 3) {
                                                    intValue = 180;
                                                    i = 90;
                                                } else if (d3 == 6) {
                                                    i = 90;
                                                    intValue = 90;
                                                } else if (d3 == 8) {
                                                    i = 90;
                                                    intValue = atv0.b;
                                                }
                                            }
                                            i = 90;
                                            intValue = 0;
                                        } else {
                                            if (Build.VERSION.SDK_INT >= 29) {
                                                Cursor query = context.getContentResolver().query(Uri.fromFile(file3), new String[]{X3.i.n}, null, null, null);
                                                if (query != null) {
                                                    try {
                                                        num = query.isNull(0) ? null : Integer.valueOf(query.getInt(0));
                                                        s3q0 s3q0Var = s3q0.a;
                                                        query.close();
                                                    } finally {
                                                    }
                                                } else {
                                                    num = null;
                                                }
                                                if (num != null) {
                                                    intValue = num.intValue();
                                                    i = 90;
                                                }
                                            }
                                            i = 90;
                                            intValue = 0;
                                        }
                                        pair = (intValue == i || intValue == 270) ? new Pair(new Size(d2, d), Integer.valueOf(intValue)) : new Pair(new Size(d, d2), Integer.valueOf(intValue));
                                        z = false;
                                        openInputStream.close();
                                    } finally {
                                    }
                                } else {
                                    file = file2;
                                    jbdVar = jbdVar2;
                                    z = z2;
                                    pair = null;
                                }
                                Size size2 = pair != null ? (Size) pair.i() : null;
                                Integer num2 = pair != null ? (Integer) pair.j() : null;
                                if (size2 == null) {
                                    size = m9e.h;
                                } else {
                                    float min = Math.min(1.0f, 2560 / Math.max(size2.getHeight(), size2.getWidth()));
                                    size = new Size((int) (size2.getWidth() * min), (int) (size2.getHeight() * min));
                                }
                                MediaPipelineComponent mediaPipelineComponent = (MediaPipelineComponent) ((k7m) m7m.f(m9eVar)).a(fpf0.a(MediaPipelineComponent.class));
                                VideoRawItem videoRawItem = new VideoRawItem(new ImageFileMediaSource(Uri.fromFile(file3), num2 != null ? num2.intValue() : z), 0L, aVar2.b * 1000, 1.0d, null, 16, null);
                                meg megVar = new meg(new lwo0(mediaPipelineComponent.Gd()));
                                megVar.a(videoRawItem);
                                Timeline b4 = megVar.b().b();
                                StringBuilder sb = new StringBuilder("\n            create photo encoding task: ");
                                sb.append(file3.getPath());
                                sb.append("\n            origin size = ");
                                sb.append(size2 != null ? Integer.valueOf(size2.getWidth()) : null);
                                sb.append('x');
                                sb.append(size2 != null ? Integer.valueOf(size2.getHeight()) : null);
                                sb.append("\n            target size = ");
                                sb.append(size.getWidth());
                                sb.append('x');
                                sb.append(size.getHeight());
                                sb.append("\n            ");
                                lyd.a.d(Arrays.copyOf(new Object[]{"ClipsGalleryProcessingUtils", xqm0.g(sb.toString())}, 2));
                                obj = null;
                                u8dVar = new u8d(aVar2.a, e, hpa0.a.a(mediaPipelineComponent.p6(context), "clip_photo_convert").c(b4).build(), new ykm0(e, new TransformFormat(MediaQuality.HIGH, new TransformFormat.VideoOutputFormat(size.getWidth(), size.getHeight(), 15, null, null, 24, null), null), new jkp0(new l9e(aVar3))), size2, m9e.h);
                            }
                            arrayList2.add(u8dVar);
                            obj2 = obj;
                            file2 = file;
                            jbdVar2 = jbdVar;
                            i2 = 2;
                            z2 = false;
                        }
                        int max = m9eVar.c.b() ? 1 : Math.max(1, Runtime.getRuntime().availableProcessors() - 1);
                        cmf cmfVar = m9eVar.b;
                        AtomicBoolean atomicBoolean3 = atomicBoolean;
                        s8d s8dVar = new s8d(atomicBoolean3, cmfVar, max);
                        boolean isEmpty = arrayList2.isEmpty();
                        LinkedBlockingQueue<ivc> linkedBlockingQueue = s8dVar.d;
                        AtomicInteger atomicInteger = s8dVar.e;
                        if (!isEmpty) {
                            linkedBlockingQueue.addAll(arrayList2);
                            lyd.a.d(Arrays.copyOf(new Object[]{"ClipParallelProcessor", "Added " + arrayList2.size() + " tasks"}, 2));
                            ArrayList arrayList3 = new ArrayList(c5g.u(linkedBlockingQueue, 10));
                            Iterator<ivc> it2 = linkedBlockingQueue.iterator();
                            while (it2.hasNext()) {
                                arrayList3.add(Long.valueOf(it2.next().b()));
                            }
                            double O = j5g.O(arrayList3);
                            atomicInteger.set(Math.min(atomicInteger.get(), Math.max(1, (int) (s8dVar.b / O))));
                            lyd.a.d(Arrays.copyOf(new Object[]{"ClipParallelProcessor", "AVG task memory consumption: " + O + "kb, maxPoolSize is set to: " + atomicInteger.get()}, 2));
                        }
                        if (linkedBlockingQueue.isEmpty()) {
                            atomicBoolean2 = atomicBoolean3;
                            arrayList = arrayList2;
                        } else {
                            Debug.MemoryInfo memoryInfo = new Debug.MemoryInfo();
                            Debug.getMemoryInfo(memoryInfo);
                            long parseLong = Long.parseLong(memoryInfo.getMemoryStat("summary.graphics"));
                            long parseLong2 = Long.parseLong(memoryInfo.getMemoryStat("summary.native-heap"));
                            atomicBoolean2 = atomicBoolean3;
                            long j = -1;
                            arrayList = arrayList2;
                            long j2 = -1;
                            while (true) {
                                boolean isEmpty2 = linkedBlockingQueue.isEmpty();
                                AtomicInteger atomicInteger2 = s8dVar.f;
                                if ((!isEmpty2 || atomicInteger2.get() != 0) && !s8dVar.a.get()) {
                                    long j3 = parseLong;
                                    if (atomicInteger2.get() < atomicInteger.get()) {
                                        Debug.getMemoryInfo(memoryInfo);
                                        j = Math.max(j, Long.parseLong(memoryInfo.getMemoryStat("summary.graphics")));
                                        j2 = Math.max(j2, Long.parseLong(memoryInfo.getMemoryStat("summary.native-heap")));
                                        ivc poll = linkedBlockingQueue.poll();
                                        if (poll != null) {
                                            poll.e = new lfa(1, s8dVar, poll);
                                            poll.f = new defpackage.g(s8dVar, 23);
                                            atomicInteger2.incrementAndGet();
                                            s8dVar.c.submit(poll);
                                        }
                                    }
                                    parseLong = j3;
                                }
                            }
                            long j4 = 1000;
                            long j5 = (j - parseLong) / j4;
                            long j6 = (j2 - parseLong2) / j4;
                            StringBuilder b5 = fp.b(j5 + j6, "processing successfully completed! used memory: ", "mb (graphics: ");
                            b5.append(j5);
                            lyd.a.d(Arrays.copyOf(new Object[]{"ClipParallelProcessor", e630.c(b5, "mb, native heap: ", j6, "mb)")}, 2));
                        }
                        Iterator it3 = arrayList.iterator();
                        while (it3.hasNext()) {
                            ivc ivcVar = (ivc) it3.next();
                            b920 b920Var = ivcVar.d;
                            if (b920Var instanceof lip) {
                                if (ivcVar instanceof u8d) {
                                    clipsMediaStatController$StatErrorType = ClipsMediaStatController$StatErrorType.GALLERY_PHOTO;
                                } else {
                                    if (!(ivcVar instanceof sds0)) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    clipsMediaStatController$StatErrorType = ClipsMediaStatController$StatErrorType.GALLERY_COPY;
                                }
                                lip lipVar = (lip) b920Var;
                                lyd.a.b(lipVar.c);
                                irk0 irk0Var = m9eVar.f;
                                if (irk0Var != null) {
                                    Integer num3 = m9eVar.g;
                                    Throwable th2 = lipVar.c;
                                    int i4 = fle.$EnumSwitchMapping$0[clipsMediaStatController$StatErrorType.ordinal()];
                                    if (i4 == 1) {
                                        aVar = ClipsUploadErrorsEventBuilder.a.b.a;
                                    } else {
                                        if (i4 != 2) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        aVar = ClipsUploadErrorsEventBuilder.a.C1785a.a;
                                    }
                                    new ClipsUploadErrorsEventBuilder(aVar, new ClipsUploadErrorsEventBuilder.b.a(th2), num3, irk0Var).q();
                                } else {
                                    continue;
                                }
                            }
                        }
                        ArrayList arrayList4 = new ArrayList();
                        Iterator it4 = arrayList.iterator();
                        boolean z3 = false;
                        while (it4.hasNext()) {
                            ivc ivcVar2 = (ivc) it4.next();
                            if (atomicBoolean2.get()) {
                                ivcVar2.a();
                                vhk0.d(ivcVar2.b);
                            } else {
                                b920 b920Var2 = ivcVar2.d;
                                File file4 = ivcVar2.c;
                                File file5 = ivcVar2.b;
                                if (!epx.f(b920Var2, nip.c)) {
                                    vhk0.d(file5);
                                    b920 b920Var3 = ivcVar2.d;
                                    if ((b920Var3 instanceof lip) && r1q.a(((lip) b920Var3).c)) {
                                        z3 = true;
                                    }
                                } else if (ivcVar2 instanceof sds0) {
                                    arrayList4.add(m9e.a(m9eVar, file5, TranscodingState.GALLERY_NOT_TRANSCODED, Boolean.TRUE, file4));
                                } else if (ivcVar2 instanceof u8d) {
                                    ClipsProcessedItem a2 = m9e.a(m9eVar, file5, TranscodingState.GALLERY_TRANSCODED, Boolean.FALSE, file4);
                                    arrayList4.add(new ClipsProcessedItem(a2.b, 3000L, a2.d, a2.e, a2.f, true));
                                }
                            }
                        }
                        Pair pair2 = new Pair(arrayList4, Boolean.valueOf(z3));
                        List<ClipsProcessedItem> list3 = (List) pair2.d();
                        boolean booleanValue = ((Boolean) pair2.g()).booleanValue();
                        lyd.a.d(Arrays.copyOf(new Object[]{"ClipsGalleryProcessingUtils", "successful: " + list3.size() + " out of " + arrayList.size()}, 2));
                        for (ClipsProcessedItem clipsProcessedItem : list3) {
                            StringBuilder sb2 = new StringBuilder("\n                    result = ");
                            String str2 = clipsProcessedItem.b;
                            sb2.append(str2);
                            sb2.append("\n                    videoConfig = ");
                            sb2.append(MediaUtils.a.e(str2, true));
                            sb2.append("\n                    audioConfig = ");
                            Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
                            p490.z(new ga3(str2, 1), new jb5(ref$ObjectRef, 8));
                            sb2.append((MediaUtils.AudioConfig) ref$ObjectRef.element);
                            sb2.append("\n                    ");
                            lyd.a.e(Arrays.copyOf(new Object[]{"ClipsGalleryProcessingUtils", xqm0.g(sb2.toString())}, 2));
                        }
                        if (!list3.isEmpty() || atomicBoolean2.get()) {
                            if (booleanValue) {
                                final int i5 = R.string.clip_editor_no_space_not_all_added_snackbar_title;
                                final int i6 = R.string.clip_picker_no_space_not_all_added_snackbar_subtitle;
                                i0q0.j(new Runnable() { // from class: xsna.pzd
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        Context context2 = context;
                                        ikv0.a aVar4 = new ikv0.a(context2);
                                        aVar4.t = new ikv0.c.C3058c(R.drawable.vk_icon_error_circle_outline_28, Integer.valueOf(R.attr.vk_ui_icon_negative), (Size) null, 12);
                                        aVar4.u = new ikv0.d(new ikv0.d.c(context2.getString(i5)), new ikv0.d.b(context2.getString(i6)), (ikv0.d.a) null, 4);
                                        aVar4.n();
                                    }
                                });
                            }
                            return list3;
                        }
                        if (booleanValue) {
                            final int i7 = R.string.clip_picker_no_space_nothing_added_snackbar_title;
                            final int i8 = R.string.clip_picker_no_space_nothing_addedsnackbar_subtitle;
                            i0q0.j(new Runnable() { // from class: xsna.pzd
                                @Override // java.lang.Runnable
                                public final void run() {
                                    Context context2 = context;
                                    ikv0.a aVar4 = new ikv0.a(context2);
                                    aVar4.t = new ikv0.c.C3058c(R.drawable.vk_icon_error_circle_outline_28, Integer.valueOf(R.attr.vk_ui_icon_negative), (Size) null, 12);
                                    aVar4.u = new ikv0.d(new ikv0.d.c(context2.getString(i7)), new ikv0.d.b(context2.getString(i8)), (ikv0.d.a) null, 4);
                                    aVar4.n();
                                }
                            });
                        }
                        throw new ClipsGalleryLoadException("all files processes failed");
                    }
                    Object next = it.next();
                    int i9 = i3 + 1;
                    if (i3 < 0) {
                        e43.t();
                        throw null;
                    }
                    lr10 lr10Var2 = (lr10) next;
                    if (lr10Var2 instanceof lr10.a) {
                        str = "photo";
                    } else {
                        if (!(lr10Var2 instanceof lr10.b)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        str = "video";
                    }
                    lyd.a.d(Arrays.copyOf(new Object[]{"ClipsGalleryProcessingUtils", i3 + ". " + str + ' ' + lr10Var2.a.getAbsolutePath()}, 2));
                    i3 = i9;
                }
            }
        }), new oua(atomicBoolean, 2));
        if (l3e0Var instanceof l3e0.a) {
            l3e0.a aVar = (l3e0.a) l3e0Var;
            b = cug0.c(kVar, aVar.a, new gtl(5), fVar, aVar.b, 16);
        } else {
            if (!(l3e0Var instanceof l3e0.b)) {
                throw new NoWhenBranchMatchedException();
            }
            o7j<Float> o7jVar = ((l3e0.b) l3e0Var).a;
            b = cug0.b(kVar, this.e, new gtl(5), fVar, new sk4(3), o7jVar);
        }
        return new io.reactivex.rxjava3.internal.operators.single.d0(b, new bo(12), null).q(this.b.e().e(1, "clips-gallery-processing-thread"));
    }

    public final io.reactivex.rxjava3.internal.operators.single.f0 d(File file, o7j o7jVar) {
        return c(Collections.singletonList(new lr10.b(file)), new l3e0.b(o7jVar)).q(this.b.e().e(1, "clips-gallery-processing-thread"));
    }
}
