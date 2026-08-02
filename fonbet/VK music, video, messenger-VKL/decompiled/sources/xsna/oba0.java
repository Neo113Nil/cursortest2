package xsna;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.location.Location;
import android.os.Parcelable;
import com.mbridge.msdk.foundation.download.database.DownloadModel;
import com.vk.api.generated.stories.dto.StoriesGetPhotoUploadServerAttachTypeDto;
import com.vk.api.generated.stories.dto.StoriesGetPhotoUploadServerCameraTypeDto;
import com.vk.api.generated.stories.dto.StoriesGetPhotoUploadServerEffectDto;
import com.vk.api.generated.stories.dto.StoriesGetPhotoUploadServerFilterPhotoDto;
import com.vk.api.generated.stories.dto.StoriesGetPhotoUploadServerLifetimeDto;
import com.vk.api.generated.stories.dto.StoriesGetPhotoUploadServerMemoryTypeDto;
import com.vk.api.generated.stories.dto.StoriesUploadResultDto;
import com.vk.dto.common.id.UserId;
import com.vk.dto.stories.entities.OrdData;
import com.vk.dto.stories.entities.StorySharingInfo;
import com.vk.dto.stories.entities.stat.StickersStatInfo;
import com.vk.dto.stories.entities.stat.StoryStatContainer;
import com.vk.dto.stories.model.CommonUploadParams;
import com.vk.dto.stories.model.QuestionInfo;
import com.vk.dto.stories.model.StoryEntry;
import com.vk.dto.stories.model.StoryEntryExtended;
import com.vk.dto.stories.model.StoryUploadParams;
import com.vk.dto.stories.model.clickable.ClickableStickers;
import com.vk.instantjobs.InstantJob;
import com.vk.log.L;
import com.vk.stat.scheme.MobileOfficialAppsCoreEncodingStat$TypeStoryVideoItem;
import com.vk.story.api.domain.interactor.upload.StoryTaskParams;
import com.vk.upload.core.utils.UploadException;
import com.vk.upload.impl.tasks.k;
import com.vkontakte.android.R;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.text.Regex;
import org.json.JSONArray;
import xsna.kjw;

/* compiled from: PhotoStoryUploadTaskGU.kt */
/* loaded from: classes11.dex */
public final class oba0 extends com.vk.upload.impl.tasks.k<StoryEntry> implements w8i, fv6 {
    public final String l;
    public final int m;
    public final StoryTaskParams n;
    public final avl0 o;
    public final ekm0 p;
    public final g8m0 q;
    public gcq0 r;
    public final bpn0 s;
    public final bpn0 t;
    public final bpn0 u;
    public long v;

    /* compiled from: PhotoStoryUploadTaskGU.kt */
    public static final class a extends k.a<oba0> {
        @Override // xsna.s7x
        public final InstantJob a(ny90 ny90Var) {
            int c = ny90Var.c("param_id");
            oba0 oba0Var = new oba0(ny90Var.f(DownloadModel.FILE_NAME), c, tsl0.b(c, "PhotoStoryUploadTaskGU"));
            oba0Var.d = ny90Var.c("task_id");
            return oba0Var;
        }

        @Override // com.vk.upload.impl.tasks.k.a, xsna.s7x
        public final void b(InstantJob instantJob, ny90 ny90Var) {
            oba0 oba0Var = (oba0) instantJob;
            super.b(oba0Var, ny90Var);
            int i = oba0Var.m;
            ny90Var.l("param_id", i);
            tsl0.c("PhotoStoryUploadTaskGU", i, oba0Var.n);
        }

        @Override // com.vk.upload.impl.tasks.k.a
        /* renamed from: c */
        public final void b(oba0 oba0Var, ny90 ny90Var) {
            oba0 oba0Var2 = oba0Var;
            super.b(oba0Var2, ny90Var);
            int i = oba0Var2.m;
            ny90Var.l("param_id", i);
            tsl0.c("PhotoStoryUploadTaskGU", i, oba0Var2.n);
        }

        @Override // xsna.s7x
        public final String getType() {
            return "PhotoStoryUploadTaskGU";
        }
    }

    public oba0(String str, int i, StoryTaskParams storyTaskParams) {
        super(str);
        this.l = str;
        this.m = i;
        this.n = storyTaskParams;
        this.o = new avl0();
        this.p = new ekm0();
        this.q = new g8m0();
        this.s = new bpn0(new x4u(this, 28));
        this.t = new bpn0(new Cnew(this, 23));
        this.u = new bpn0(new m130(this, 15));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.sp6
    public final void L(Parcelable parcelable) {
        kjw.a g;
        StoryEntry storyEntry = (StoryEntry) parcelable;
        long currentTimeMillis = System.currentTimeMillis() - this.v;
        Context context = e43.a;
        if (context == null) {
            context = null;
        }
        String str = this.l;
        g = kjw.g(context, jeq0.g(str), false);
        ((z6m0) this.s.getValue()).d(this.d, storyEntry != null ? Long.valueOf(storyEntry.c) : null, true, new s0q(this.v, System.currentTimeMillis(), 0L), null, null, g.a(), g.b(), null, MobileOfficialAppsCoreEncodingStat$TypeStoryVideoItem.EventType.UPLOAD);
        L.e("Uploaded photo story path: ".concat(str));
        if (storyEntry != null) {
            ((uvl0) this.u.getValue()).e(this.d, storyEntry, (int) currentTimeMillis, g());
        }
        boolean a2 = ((evl0) this.t.getValue()).a();
        String str2 = this.i;
        if (a2 && this.n.e.Nb()) {
            File file = new File(str2);
            if (file.exists()) {
                Context context2 = e43.a;
                L.e("Story photo saved in gallery");
            }
        }
        Regex regex = com.vk.core.files.a.a;
        vhk0.c(str2);
        e8r.b.a(false);
        ozg0.a().h(this.d);
    }

    @Override // xsna.sp6
    public final void M() {
        this.v = System.currentTimeMillis();
    }

    @Override // xsna.sp6
    public final void W(Exception exc) {
        kjw.a g;
        Context context = e43.a;
        if (context == null) {
            context = null;
        }
        g = kjw.g(context, jeq0.g(this.l), false);
        ((z6m0) this.s.getValue()).d(this.d, null, true, new s0q(this.v, 0L, System.currentTimeMillis()), null, exc, g.a(), g.b(), null, MobileOfficialAppsCoreEncodingStat$TypeStoryVideoItem.EventType.UPLOAD);
        ((uvl0) this.u.getValue()).k(this.d, null);
    }

    @Override // xsna.sp6
    public final void X() {
        try {
            super.X();
        } catch (Throwable th) {
            ((uvl0) this.u.getValue()).k(this.d, null);
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.sp6
    public final Parcelable Y() {
        gcq0 gcq0Var = this.r;
        if (gcq0Var == null) {
            return null;
        }
        dz2 x = yfb.x(zul0.c(this.o, gcq0Var.a(), tsl0.a(), 1));
        b25 a2 = o25.a();
        StoryTaskParams storyTaskParams = this.n;
        String s = a2.s(storyTaskParams.e.Jb());
        if (s != null) {
            x.l = s;
            x.m = "";
        }
        StoryEntry storyEntry = (StoryEntry) rsg0.a0(x).U(new bx80(new i37(this.p, 13), 1)).a();
        storyEntry.Wb(storyTaskParams.e.Gb());
        return storyEntry;
    }

    @Override // com.vk.upload.impl.b
    public final String a0() {
        Context context = e43.a;
        if (context == null) {
            context = null;
        }
        return context.getString(R.string.story_sending);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(69:0|1|(1:3)(1:203)|4|(1:6)(1:202)|7|(1:11)(1:(1:196)(1:(1:200)(1:201)))|12|13|(1:15)(1:192)|16|(1:18)(1:191)|19|(1:21)(1:190)|22|(1:189)(1:26)|27|(1:29)(1:188)|30|(3:32|(1:34)|(48:36|37|(1:186)(4:41|(2:44|42)|45|46)|47|(3:49|(1:51)|(44:53|(2:56|54)|57|58|59|(1:61)(1:184)|62|(1:64)(1:183)|65|(1:67)(1:182)|68|(1:70)(1:181)|(1:72)(1:180)|(1:179)(1:82)|(1:178)(4:86|(2:89|87)|90|91)|(1:93)(1:177)|(1:95)(1:176)|(2:(1:100)|(26:102|(2:(1:107)|(20:109|(1:173)(1:116)|(1:172)|(1:171)(1:128)|(1:170)(1:134)|(1:136)(1:169)|(1:138)(1:168)|(1:140)(1:167)|141|(1:143)(1:166)|144|145|146|147|148|(2:149|(2:151|(1:153)(1:160))(2:161|162))|154|(1:156)|157|158))|174|(1:111)|173|(1:118)|172|(1:124)|171|(1:130)|170|(0)(0)|(0)(0)|(0)(0)|141|(0)(0)|144|145|146|147|148|(3:149|(0)(0)|160)|154|(0)|157|158))|175|(3:104|(0)|(0))|174|(0)|173|(0)|172|(0)|171|(0)|170|(0)(0)|(0)(0)|(0)(0)|141|(0)(0)|144|145|146|147|148|(3:149|(0)(0)|160)|154|(0)|157|158))|185|59|(0)(0)|62|(0)(0)|65|(0)(0)|68|(0)(0)|(0)(0)|(1:74)|179|(1:84)|178|(0)(0)|(0)(0)|(3:97|(0)|(0))|175|(0)|174|(0)|173|(0)|172|(0)|171|(0)|170|(0)(0)|(0)(0)|(0)(0)|141|(0)(0)|144|145|146|147|148|(3:149|(0)(0)|160)|154|(0)|157|158))|187|37|(1:39)|186|47|(0)|185|59|(0)(0)|62|(0)(0)|65|(0)(0)|68|(0)(0)|(0)(0)|(0)|179|(0)|178|(0)(0)|(0)(0)|(0)|175|(0)|174|(0)|173|(0)|172|(0)|171|(0)|170|(0)(0)|(0)(0)|(0)(0)|141|(0)(0)|144|145|146|147|148|(3:149|(0)(0)|160)|154|(0)|157|158) */
    /* JADX WARN: Code restructure failed: missing block: B:164:0x0304, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:165:0x0305, code lost:
    
        com.vk.log.L.i(r0);
        r48 = null;
     */
    /* JADX WARN: Removed duplicated region for block: B:100:0x0221  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0224  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0236  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x023f  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0242  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0252  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0267  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0279  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x028c  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x029f  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x02aa  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x02b9  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x02d0  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0318  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0358  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x032e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:166:0x02d7  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x02c0  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x02b5  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x02a6  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0215  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x020c  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x01b4  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01d5  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0203  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x020f  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0218  */
    @Override // com.vk.upload.impl.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final io.reactivex.rxjava3.core.q<ncq0> b0() {
        StoriesGetPhotoUploadServerAttachTypeDto storiesGetPhotoUploadServerAttachTypeDto;
        StoriesGetPhotoUploadServerCameraTypeDto storiesGetPhotoUploadServerCameraTypeDto;
        StoriesGetPhotoUploadServerEffectDto storiesGetPhotoUploadServerEffectDto;
        String str;
        StoryStatContainer Pb;
        ArrayList arrayList;
        List<QuestionInfo> Mb;
        ArrayList arrayList2;
        String Cb;
        StoriesGetPhotoUploadServerFilterPhotoDto storiesGetPhotoUploadServerFilterPhotoDto;
        ArrayList arrayList3;
        StorySharingInfo storySharingInfo;
        Integer num;
        Integer num2;
        String str2;
        Iterator<E> it;
        Object obj;
        String s;
        String Hb;
        String Cb2;
        String C1;
        Long Cb3;
        Long Db;
        List<Long> Bb;
        StoryEntryExtended Gb;
        StoryEntry zb;
        String Fb;
        List<StickersStatInfo> zb2;
        JSONArray Ab;
        StoryTaskParams storyTaskParams = this.n;
        CommonUploadParams commonUploadParams = storyTaskParams.e;
        StorySharingInfo Ib = commonUploadParams != null ? commonUploadParams.Ib() : null;
        g8m0 g8m0Var = this.q;
        if (Ib != null) {
            int zb3 = Ib.zb();
            g8m0Var.getClass();
            storiesGetPhotoUploadServerAttachTypeDto = g8m0.d(zb3);
        } else {
            storiesGetPhotoUploadServerAttachTypeDto = null;
        }
        StoryUploadParams storyUploadParams = storyTaskParams.f;
        Integer Eb = storyUploadParams.Eb();
        StoriesGetPhotoUploadServerLifetimeDto storiesGetPhotoUploadServerLifetimeDto = (Eb != null && Eb.intValue() == 1) ? StoriesGetPhotoUploadServerLifetimeDto.TYPE_3600 : (Eb != null && Eb.intValue() == 12) ? StoriesGetPhotoUploadServerLifetimeDto.TYPE_43200 : (Eb != null && Eb.intValue() == 48) ? StoriesGetPhotoUploadServerLifetimeDto.TYPE_172800 : StoriesGetPhotoUploadServerLifetimeDto.TYPE_86400;
        String Gb2 = storyUploadParams.Gb();
        Integer Nb = storyUploadParams.Nb();
        Location Fb2 = storyUploadParams.Fb();
        Float valueOf = Fb2 != null ? Float.valueOf((float) Fb2.getLatitude()) : null;
        Location Fb3 = storyUploadParams.Fb();
        Float valueOf2 = Fb3 != null ? Float.valueOf((float) Fb3.getLongitude()) : null;
        StoryUploadParams.CameraType Ab2 = storyUploadParams.Ab();
        if (Ab2 != null) {
            g8m0Var.getClass();
            storiesGetPhotoUploadServerCameraTypeDto = g8m0.c(Ab2);
        } else {
            storiesGetPhotoUploadServerCameraTypeDto = null;
        }
        StoryStatContainer Pb2 = storyUploadParams.Pb();
        String jSONArray = (Pb2 == null || (Ab = Pb2.Ab()) == null) ? null : Ab.toString();
        Boolean valueOf3 = Boolean.valueOf(storyUploadParams.Sb());
        String zb4 = storyUploadParams.zb();
        if (zb4 != null) {
            g8m0Var.getClass();
            storiesGetPhotoUploadServerEffectDto = g8m0.a(zb4);
        } else {
            storiesGetPhotoUploadServerEffectDto = null;
        }
        ClickableStickers Bb2 = storyUploadParams.Bb();
        if (Bb2 != null) {
            if (Bb2.Cb().isEmpty()) {
                Bb2 = null;
            }
            if (Bb2 != null) {
                str = Bb2.e5().toString();
                Pb = storyUploadParams.Pb();
                if (Pb != null || (zb2 = Pb.zb()) == null) {
                    arrayList = null;
                } else {
                    List<StickersStatInfo> list = zb2;
                    ArrayList arrayList4 = new ArrayList(c5g.u(list, 10));
                    Iterator<T> it2 = list.iterator();
                    while (it2.hasNext()) {
                        arrayList4.add(Long.valueOf(((StickersStatInfo) it2.next()).zb()));
                    }
                    arrayList = arrayList4;
                }
                Mb = storyUploadParams.Mb();
                if (Mb != null) {
                    if (Mb.isEmpty()) {
                        Mb = null;
                    }
                    if (Mb != null) {
                        ArrayList arrayList5 = new ArrayList(c5g.u(Mb, 10));
                        Iterator<T> it3 = Mb.iterator();
                        while (it3.hasNext()) {
                            arrayList5.add(((QuestionInfo) it3.next()).zb());
                        }
                        arrayList2 = arrayList5;
                        Boolean Ub = storyUploadParams.Ub();
                        String Ib2 = storyUploadParams.Ib();
                        Cb = storyUploadParams.Cb();
                        if (Cb != null) {
                            g8m0Var.getClass();
                            storiesGetPhotoUploadServerFilterPhotoDto = g8m0.b(Cb);
                        } else {
                            storiesGetPhotoUploadServerFilterPhotoDto = null;
                        }
                        Integer Ob = storyUploadParams.Ob();
                        Integer Lb = storyUploadParams.Lb();
                        OrdData Jb = storyUploadParams.Jb();
                        String Bb3 = Jb != null ? Jb.Bb() : null;
                        OrdData Jb2 = storyUploadParams.Jb();
                        String Ab3 = Jb2 != null ? Jb2.Ab() : null;
                        OrdData Jb3 = storyUploadParams.Jb();
                        Boolean valueOf4 = Jb3 != null ? Boolean.valueOf(Jb3.W3()) : null;
                        UserId Db2 = commonUploadParams != null ? commonUploadParams.Db() : null;
                        String str3 = (commonUploadParams != null || (Gb = commonUploadParams.Gb()) == null || (zb = Gb.zb()) == null || (Fb = zb.Fb()) == null || !commonUploadParams.Mb()) ? null : Fb;
                        if (commonUploadParams != null || (Bb = commonUploadParams.Bb()) == null) {
                            arrayList3 = null;
                        } else {
                            List<Long> list2 = Bb;
                            ArrayList arrayList6 = new ArrayList(c5g.u(list2, 10));
                            Iterator<T> it4 = list2.iterator();
                            while (it4.hasNext()) {
                                dq.h(((Number) it4.next()).longValue(), arrayList6);
                            }
                            arrayList3 = arrayList6;
                        }
                        Boolean valueOf5 = commonUploadParams != null ? Boolean.valueOf(commonUploadParams.Ab()) : null;
                        String Ab4 = Ib != null ? Ib.Ab() : null;
                        if (Ib != null && (Db = Ib.Db()) != null) {
                            if (storiesGetPhotoUploadServerAttachTypeDto == null) {
                                Db = null;
                            }
                            if (Db != null) {
                                storySharingInfo = Ib;
                                num = Integer.valueOf((int) Db.longValue());
                                if (storySharingInfo != null && (Cb3 = storySharingInfo.Cb()) != null) {
                                    if (storiesGetPhotoUploadServerAttachTypeDto == null) {
                                        Cb3 = null;
                                    }
                                    if (Cb3 != null) {
                                        num2 = Integer.valueOf((int) Cb3.longValue());
                                        String str4 = (storySharingInfo != null || (C1 = storySharingInfo.C1()) == null || storiesGetPhotoUploadServerAttachTypeDto == null || C1.length() <= 0) ? null : C1;
                                        if (storySharingInfo != null || (str2 = storySharingInfo.Bb()) == null || storiesGetPhotoUploadServerAttachTypeDto != null || str2.length() <= 0) {
                                            str2 = null;
                                        }
                                        String str5 = (commonUploadParams != null || (Cb2 = commonUploadParams.Cb()) == null || Cb2.length() <= 0) ? null : Cb2;
                                        String str6 = (commonUploadParams != null || (Hb = commonUploadParams.Hb()) == null || Hb.length() <= 0) ? null : Hb;
                                        Integer Eb2 = commonUploadParams != null ? commonUploadParams.Eb() : null;
                                        Boolean valueOf6 = commonUploadParams != null ? Boolean.valueOf(commonUploadParams.Lb()) : null;
                                        List<Integer> Fb4 = commonUploadParams != null ? commonUploadParams.Fb() : null;
                                        String e = sxc0.a().e(commonUploadParams, storyUploadParams);
                                        String Kb = storyUploadParams.Kb();
                                        List singletonList = Kb != null ? Collections.singletonList(Kb) : null;
                                        boolean Tb = storyTaskParams.f.Tb();
                                        String str7 = this.l;
                                        BitmapFactory.Options options = new BitmapFactory.Options();
                                        options.inJustDecodeBounds = true;
                                        BitmapFactory.decodeFile(str7, options);
                                        options.inSampleSize = kd7.a(100, 100, options);
                                        options.inJustDecodeBounds = false;
                                        Bitmap decodeFile = BitmapFactory.decodeFile(str7, options);
                                        String a2 = jso0.a(decodeFile);
                                        decodeFile.recycle();
                                        String str8 = a2;
                                        it = StoriesGetPhotoUploadServerMemoryTypeDto.i().iterator();
                                        while (true) {
                                            if (!it.hasNext()) {
                                                obj = null;
                                                break;
                                            }
                                            obj = it.next();
                                            if (epx.f(((StoriesGetPhotoUploadServerMemoryTypeDto) obj).j(), storyUploadParams.Hb())) {
                                                break;
                                            }
                                        }
                                        dz2 x = yfb.x(zul0.f(this.o, valueOf5, arrayList3, str3, arrayList2, Ab4, str2, Gb2, (StoriesGetPhotoUploadServerMemoryTypeDto) obj, storyUploadParams.L, Db2, Nb, storiesGetPhotoUploadServerCameraTypeDto, storiesGetPhotoUploadServerEffectDto, storiesGetPhotoUploadServerFilterPhotoDto, jSONArray, valueOf, valueOf2, storiesGetPhotoUploadServerAttachTypeDto, num, num2, str4, valueOf3, str, arrayList, str6, str5, e, Ub, valueOf6, Eb2, Ob, Lb, Ib2, Fb4, singletonList, Bb3, Ab3, valueOf4, storiesGetPhotoUploadServerLifetimeDto, Boolean.valueOf(Tb), str8, 1808));
                                        s = o25.a().s(storyTaskParams.e.Jb());
                                        if (s != null) {
                                            x.l = s;
                                            x.m = "";
                                        }
                                        this.g = x.b;
                                        return rsg0.a0(x).U(new cfz(new y8m(22), 9));
                                    }
                                }
                                num2 = null;
                                if (storySharingInfo != null) {
                                }
                                if (storySharingInfo != null) {
                                }
                                str2 = null;
                                if (commonUploadParams != null) {
                                }
                                if (commonUploadParams != null) {
                                }
                                if (commonUploadParams != null) {
                                }
                                if (commonUploadParams != null) {
                                }
                                if (commonUploadParams != null) {
                                }
                                String e2 = sxc0.a().e(commonUploadParams, storyUploadParams);
                                String Kb2 = storyUploadParams.Kb();
                                if (Kb2 != null) {
                                }
                                boolean Tb2 = storyTaskParams.f.Tb();
                                String str72 = this.l;
                                BitmapFactory.Options options2 = new BitmapFactory.Options();
                                options2.inJustDecodeBounds = true;
                                BitmapFactory.decodeFile(str72, options2);
                                options2.inSampleSize = kd7.a(100, 100, options2);
                                options2.inJustDecodeBounds = false;
                                Bitmap decodeFile2 = BitmapFactory.decodeFile(str72, options2);
                                String a22 = jso0.a(decodeFile2);
                                decodeFile2.recycle();
                                String str82 = a22;
                                it = StoriesGetPhotoUploadServerMemoryTypeDto.i().iterator();
                                while (true) {
                                    if (!it.hasNext()) {
                                    }
                                }
                                dz2 x2 = yfb.x(zul0.f(this.o, valueOf5, arrayList3, str3, arrayList2, Ab4, str2, Gb2, (StoriesGetPhotoUploadServerMemoryTypeDto) obj, storyUploadParams.L, Db2, Nb, storiesGetPhotoUploadServerCameraTypeDto, storiesGetPhotoUploadServerEffectDto, storiesGetPhotoUploadServerFilterPhotoDto, jSONArray, valueOf, valueOf2, storiesGetPhotoUploadServerAttachTypeDto, num, num2, str4, valueOf3, str, arrayList, str6, str5, e2, Ub, valueOf6, Eb2, Ob, Lb, Ib2, Fb4, singletonList, Bb3, Ab3, valueOf4, storiesGetPhotoUploadServerLifetimeDto, Boolean.valueOf(Tb2), str82, 1808));
                                s = o25.a().s(storyTaskParams.e.Jb());
                                if (s != null) {
                                }
                                this.g = x2.b;
                                return rsg0.a0(x2).U(new cfz(new y8m(22), 9));
                            }
                        }
                        storySharingInfo = Ib;
                        num = null;
                        if (storySharingInfo != null) {
                            if (storiesGetPhotoUploadServerAttachTypeDto == null) {
                            }
                            if (Cb3 != null) {
                            }
                        }
                        num2 = null;
                        if (storySharingInfo != null) {
                        }
                        if (storySharingInfo != null) {
                        }
                        str2 = null;
                        if (commonUploadParams != null) {
                        }
                        if (commonUploadParams != null) {
                        }
                        if (commonUploadParams != null) {
                        }
                        if (commonUploadParams != null) {
                        }
                        if (commonUploadParams != null) {
                        }
                        String e22 = sxc0.a().e(commonUploadParams, storyUploadParams);
                        String Kb22 = storyUploadParams.Kb();
                        if (Kb22 != null) {
                        }
                        boolean Tb22 = storyTaskParams.f.Tb();
                        String str722 = this.l;
                        BitmapFactory.Options options22 = new BitmapFactory.Options();
                        options22.inJustDecodeBounds = true;
                        BitmapFactory.decodeFile(str722, options22);
                        options22.inSampleSize = kd7.a(100, 100, options22);
                        options22.inJustDecodeBounds = false;
                        Bitmap decodeFile22 = BitmapFactory.decodeFile(str722, options22);
                        String a222 = jso0.a(decodeFile22);
                        decodeFile22.recycle();
                        String str822 = a222;
                        it = StoriesGetPhotoUploadServerMemoryTypeDto.i().iterator();
                        while (true) {
                            if (!it.hasNext()) {
                            }
                        }
                        dz2 x22 = yfb.x(zul0.f(this.o, valueOf5, arrayList3, str3, arrayList2, Ab4, str2, Gb2, (StoriesGetPhotoUploadServerMemoryTypeDto) obj, storyUploadParams.L, Db2, Nb, storiesGetPhotoUploadServerCameraTypeDto, storiesGetPhotoUploadServerEffectDto, storiesGetPhotoUploadServerFilterPhotoDto, jSONArray, valueOf, valueOf2, storiesGetPhotoUploadServerAttachTypeDto, num, num2, str4, valueOf3, str, arrayList, str6, str5, e22, Ub, valueOf6, Eb2, Ob, Lb, Ib2, Fb4, singletonList, Bb3, Ab3, valueOf4, storiesGetPhotoUploadServerLifetimeDto, Boolean.valueOf(Tb22), str822, 1808));
                        s = o25.a().s(storyTaskParams.e.Jb());
                        if (s != null) {
                        }
                        this.g = x22.b;
                        return rsg0.a0(x22).U(new cfz(new y8m(22), 9));
                    }
                }
                arrayList2 = null;
                Boolean Ub2 = storyUploadParams.Ub();
                String Ib22 = storyUploadParams.Ib();
                Cb = storyUploadParams.Cb();
                if (Cb != null) {
                }
                Integer Ob2 = storyUploadParams.Ob();
                Integer Lb2 = storyUploadParams.Lb();
                OrdData Jb4 = storyUploadParams.Jb();
                if (Jb4 != null) {
                }
                OrdData Jb22 = storyUploadParams.Jb();
                if (Jb22 != null) {
                }
                OrdData Jb32 = storyUploadParams.Jb();
                if (Jb32 != null) {
                }
                if (commonUploadParams != null) {
                }
                if (commonUploadParams != null) {
                }
                if (commonUploadParams != null) {
                }
                arrayList3 = null;
                if (commonUploadParams != null) {
                }
                if (Ib != null) {
                }
                if (Ib != null) {
                    if (storiesGetPhotoUploadServerAttachTypeDto == null) {
                    }
                    if (Db != null) {
                    }
                }
                storySharingInfo = Ib;
                num = null;
                if (storySharingInfo != null) {
                }
                num2 = null;
                if (storySharingInfo != null) {
                }
                if (storySharingInfo != null) {
                }
                str2 = null;
                if (commonUploadParams != null) {
                }
                if (commonUploadParams != null) {
                }
                if (commonUploadParams != null) {
                }
                if (commonUploadParams != null) {
                }
                if (commonUploadParams != null) {
                }
                String e222 = sxc0.a().e(commonUploadParams, storyUploadParams);
                String Kb222 = storyUploadParams.Kb();
                if (Kb222 != null) {
                }
                boolean Tb222 = storyTaskParams.f.Tb();
                String str7222 = this.l;
                BitmapFactory.Options options222 = new BitmapFactory.Options();
                options222.inJustDecodeBounds = true;
                BitmapFactory.decodeFile(str7222, options222);
                options222.inSampleSize = kd7.a(100, 100, options222);
                options222.inJustDecodeBounds = false;
                Bitmap decodeFile222 = BitmapFactory.decodeFile(str7222, options222);
                String a2222 = jso0.a(decodeFile222);
                decodeFile222.recycle();
                String str8222 = a2222;
                it = StoriesGetPhotoUploadServerMemoryTypeDto.i().iterator();
                while (true) {
                    if (!it.hasNext()) {
                    }
                }
                dz2 x222 = yfb.x(zul0.f(this.o, valueOf5, arrayList3, str3, arrayList2, Ab4, str2, Gb2, (StoriesGetPhotoUploadServerMemoryTypeDto) obj, storyUploadParams.L, Db2, Nb, storiesGetPhotoUploadServerCameraTypeDto, storiesGetPhotoUploadServerEffectDto, storiesGetPhotoUploadServerFilterPhotoDto, jSONArray, valueOf, valueOf2, storiesGetPhotoUploadServerAttachTypeDto, num, num2, str4, valueOf3, str, arrayList, str6, str5, e222, Ub2, valueOf6, Eb2, Ob2, Lb2, Ib22, Fb4, singletonList, Bb3, Ab3, valueOf4, storiesGetPhotoUploadServerLifetimeDto, Boolean.valueOf(Tb222), str8222, 1808));
                s = o25.a().s(storyTaskParams.e.Jb());
                if (s != null) {
                }
                this.g = x222.b;
                return rsg0.a0(x222).U(new cfz(new y8m(22), 9));
            }
        }
        str = null;
        Pb = storyUploadParams.Pb();
        if (Pb != null) {
        }
        arrayList = null;
        Mb = storyUploadParams.Mb();
        if (Mb != null) {
        }
        arrayList2 = null;
        Boolean Ub22 = storyUploadParams.Ub();
        String Ib222 = storyUploadParams.Ib();
        Cb = storyUploadParams.Cb();
        if (Cb != null) {
        }
        Integer Ob22 = storyUploadParams.Ob();
        Integer Lb22 = storyUploadParams.Lb();
        OrdData Jb42 = storyUploadParams.Jb();
        if (Jb42 != null) {
        }
        OrdData Jb222 = storyUploadParams.Jb();
        if (Jb222 != null) {
        }
        OrdData Jb322 = storyUploadParams.Jb();
        if (Jb322 != null) {
        }
        if (commonUploadParams != null) {
        }
        if (commonUploadParams != null) {
        }
        if (commonUploadParams != null) {
        }
        arrayList3 = null;
        if (commonUploadParams != null) {
        }
        if (Ib != null) {
        }
        if (Ib != null) {
        }
        storySharingInfo = Ib;
        num = null;
        if (storySharingInfo != null) {
        }
        num2 = null;
        if (storySharingInfo != null) {
        }
        if (storySharingInfo != null) {
        }
        str2 = null;
        if (commonUploadParams != null) {
        }
        if (commonUploadParams != null) {
        }
        if (commonUploadParams != null) {
        }
        if (commonUploadParams != null) {
        }
        if (commonUploadParams != null) {
        }
        String e2222 = sxc0.a().e(commonUploadParams, storyUploadParams);
        String Kb2222 = storyUploadParams.Kb();
        if (Kb2222 != null) {
        }
        boolean Tb2222 = storyTaskParams.f.Tb();
        String str72222 = this.l;
        BitmapFactory.Options options2222 = new BitmapFactory.Options();
        options2222.inJustDecodeBounds = true;
        BitmapFactory.decodeFile(str72222, options2222);
        options2222.inSampleSize = kd7.a(100, 100, options2222);
        options2222.inJustDecodeBounds = false;
        Bitmap decodeFile2222 = BitmapFactory.decodeFile(str72222, options2222);
        String a22222 = jso0.a(decodeFile2222);
        decodeFile2222.recycle();
        String str82222 = a22222;
        it = StoriesGetPhotoUploadServerMemoryTypeDto.i().iterator();
        while (true) {
            if (!it.hasNext()) {
            }
        }
        dz2 x2222 = yfb.x(zul0.f(this.o, valueOf5, arrayList3, str3, arrayList2, Ab4, str2, Gb2, (StoriesGetPhotoUploadServerMemoryTypeDto) obj, storyUploadParams.L, Db2, Nb, storiesGetPhotoUploadServerCameraTypeDto, storiesGetPhotoUploadServerEffectDto, storiesGetPhotoUploadServerFilterPhotoDto, jSONArray, valueOf, valueOf2, storiesGetPhotoUploadServerAttachTypeDto, num, num2, str4, valueOf3, str, arrayList, str6, str5, e2222, Ub22, valueOf6, Eb2, Ob22, Lb22, Ib222, Fb4, singletonList, Bb3, Ab3, valueOf4, storiesGetPhotoUploadServerLifetimeDto, Boolean.valueOf(Tb2222), str82222, 1808));
        s = o25.a().s(storyTaskParams.e.Jb());
        if (s != null) {
        }
        this.g = x2222.b;
        return rsg0.a0(x2222).U(new cfz(new y8m(22), 9));
    }

    @Override // xsna.fv6
    public final gcq0 e() {
        return this.r;
    }

    @Override // xsna.fv6
    public final int g() {
        return (int) (new File(this.i).length() / 1024);
    }

    @Override // com.vk.upload.impl.tasks.k
    public final void g0(String str) throws UploadException {
        try {
            this.r = new gcq0(Collections.singletonList(new StoriesUploadResultDto(str)));
        } catch (Exception e) {
            throw new UploadException("can't parse upload response: ".concat(str), e);
        }
    }

    @Override // com.vk.instantjobs.InstantJob
    public final String q() {
        return "story-upload-queue";
    }

    @Override // com.vk.instantjobs.InstantJob
    public final String s() {
        return "PhotoStoryUploadTaskGU";
    }

    @Override // com.vk.upload.impl.tasks.k, com.vk.upload.impl.b, xsna.sp6, xsna.ye6, com.vk.instantjobs.InstantJob
    public final void u(Object obj) {
        super.u(obj);
        e8r.b.a(false);
        ozg0.a().o();
    }

    @Override // xsna.ye6, com.vk.instantjobs.InstantJob
    public final void v(Object obj, Throwable th) {
        super.v(obj, th);
        ozg0.a().o();
    }

    @Override // com.vk.instantjobs.InstantJob
    public final boolean y() {
        return false;
    }
}
