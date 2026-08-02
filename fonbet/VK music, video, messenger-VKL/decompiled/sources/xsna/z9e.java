package xsna;

import android.content.Context;
import android.location.Location;
import android.media.MediaMetadataRetriever;
import android.net.Uri;
import com.vk.core.serialize.Serializer;
import com.vk.dto.clips.ClipsVideoItemLocation;
import com.vk.dto.geo.GeoLocation;
import com.vk.media.MediaUtils;
import java.io.File;
import java.io.Serializable;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.a;
import kotlin.collections.EmptyList;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import xsna.b6l;
import xsna.e43;
import xsna.lsr;
import xsna.nb9;
import xsna.s3q0;
import xsna.spj;
import xsna.z9e;

/* compiled from: ClipsGeolocationInteractorImpl.kt */
/* loaded from: classes17.dex */
public final class z9e implements x9e {
    public final Context a;

    public z9e(Context context) {
        this.a = context;
    }

    /* JADX WARN: Not initialized variable reg: 2, insn: 0x0024: MOVE (r1 I:??[OBJECT, ARRAY]) = (r2 I:??[OBJECT, ARRAY]) (LINE:37), block:B:21:0x0024 */
    /* JADX WARN: Removed duplicated region for block: B:23:0x003a  */
    @Override // xsna.x9e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Location a(File file) {
        MediaMetadataRetriever mediaMetadataRetriever;
        MediaMetadataRetriever mediaMetadataRetriever2;
        Context context = this.a;
        Uri fromFile = Uri.fromFile(file);
        MediaMetadataRetriever mediaMetadataRetriever3 = null;
        try {
            try {
                mediaMetadataRetriever = new MediaMetadataRetriever();
                try {
                    mediaMetadataRetriever.setDataSource(context, fromFile);
                    String extractMetadata = mediaMetadataRetriever.extractMetadata(23);
                    if (extractMetadata == null) {
                        mediaMetadataRetriever.release();
                        return null;
                    }
                    Location o = MediaUtils.a.o(extractMetadata);
                    mediaMetadataRetriever.release();
                    return o;
                } catch (Exception e) {
                    e = e;
                    fromFile.toString();
                    e.toString();
                    if (mediaMetadataRetriever != null) {
                        mediaMetadataRetriever.release();
                    }
                    return null;
                }
            } catch (Throwable th) {
                th = th;
                mediaMetadataRetriever3 = mediaMetadataRetriever2;
                if (mediaMetadataRetriever3 != null) {
                    mediaMetadataRetriever3.release();
                }
                throw th;
            }
        } catch (Exception e2) {
            e = e2;
            mediaMetadataRetriever = null;
        } catch (Throwable th2) {
            th = th2;
            if (mediaMetadataRetriever3 != null) {
            }
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // xsna.x9e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Serializable b(List list, int i, ContinuationImpl continuationImpl) {
        y9e y9eVar;
        Object obj;
        CoroutineSingletons coroutineSingletons;
        int i2;
        z9e z9eVar;
        z9e z9eVar2;
        if (continuationImpl instanceof y9e) {
            y9eVar = (y9e) continuationImpl;
            int i3 = y9eVar.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                y9eVar.label = i3 - Integer.MIN_VALUE;
                obj = y9eVar.result;
                coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i2 = y9eVar.label;
                if (i2 != 0) {
                    kotlin.a.a(obj);
                    y9eVar.L$0 = null;
                    y9eVar.L$1 = this;
                    y9eVar.I$0 = i;
                    y9eVar.label = 1;
                    List list2 = list;
                    boolean isEmpty = list2.isEmpty();
                    Object obj2 = list2;
                    if (isEmpty) {
                        AtomicReference<Location> atomicReference = oxz.a;
                        Context context = this.a;
                        if (oxz.a(context)) {
                            final nb9 a = cdn.a(oxz.c(5000L, context));
                            Object n = rsr.n(new ksr<List<? extends ClipsVideoItemLocation>>() { // from class: com.vk.clips.upload.vk.ui.impl.fragment.data.ClipsGeolocationInteractorImpl$getNearestLocations$lambda$1$$inlined$map$1

                                /* compiled from: Emitters.kt */
                                /* renamed from: com.vk.clips.upload.vk.ui.impl.fragment.data.ClipsGeolocationInteractorImpl$getNearestLocations$lambda$1$$inlined$map$1$2, reason: invalid class name */
                                public static final class AnonymousClass2<T> implements lsr {
                                    public final /* synthetic */ lsr b;

                                    @b6l(c = "com.vk.clips.upload.vk.ui.impl.fragment.data.ClipsGeolocationInteractorImpl$getNearestLocations$lambda$1$$inlined$map$1$2", f = "ClipsGeolocationInteractorImpl.kt", l = {50}, m = "emit")
                                    /* renamed from: com.vk.clips.upload.vk.ui.impl.fragment.data.ClipsGeolocationInteractorImpl$getNearestLocations$lambda$1$$inlined$map$1$2$1, reason: invalid class name */
                                    public static final class AnonymousClass1 extends ContinuationImpl {
                                        int I$0;
                                        Object L$0;
                                        Object L$1;
                                        Object L$2;
                                        Object L$3;
                                        int label;
                                        /* synthetic */ Object result;

                                        public AnonymousClass1(spj spjVar) {
                                            super(spjVar);
                                        }

                                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                        public final Object invokeSuspend(Object obj) {
                                            this.result = obj;
                                            this.label |= Integer.MIN_VALUE;
                                            return AnonymousClass2.this.emit(null, this);
                                        }
                                    }

                                    public AnonymousClass2(lsr lsrVar, z9e z9eVar) {
                                        this.b = lsrVar;
                                    }

                                    /* JADX WARN: Removed duplicated region for block: B:15:0x0037  */
                                    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
                                    @Override // xsna.lsr
                                    /*
                                        Code decompiled incorrectly, please refer to instructions dump.
                                    */
                                    public final Object emit(Object obj, spj spjVar) {
                                        AnonymousClass1 anonymousClass1;
                                        int i;
                                        if (spjVar instanceof AnonymousClass1) {
                                            anonymousClass1 = (AnonymousClass1) spjVar;
                                            int i2 = anonymousClass1.label;
                                            if ((i2 & Integer.MIN_VALUE) != 0) {
                                                anonymousClass1.label = i2 - Integer.MIN_VALUE;
                                                Object obj2 = anonymousClass1.result;
                                                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                                                i = anonymousClass1.label;
                                                if (i != 0) {
                                                    a.a(obj2);
                                                    Serializer.c<ClipsVideoItemLocation> cVar = ClipsVideoItemLocation.CREATOR;
                                                    List m = e43.m(ClipsVideoItemLocation.a.a((Location) obj));
                                                    anonymousClass1.L$0 = null;
                                                    anonymousClass1.L$1 = null;
                                                    anonymousClass1.L$2 = null;
                                                    anonymousClass1.L$3 = null;
                                                    anonymousClass1.I$0 = 0;
                                                    anonymousClass1.label = 1;
                                                    if (this.b.emit(m, anonymousClass1) == coroutineSingletons) {
                                                        return coroutineSingletons;
                                                    }
                                                } else {
                                                    if (i != 1) {
                                                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                                    }
                                                    a.a(obj2);
                                                }
                                                return s3q0.a;
                                            }
                                        }
                                        anonymousClass1 = new AnonymousClass1(spjVar);
                                        Object obj22 = anonymousClass1.result;
                                        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                                        i = anonymousClass1.label;
                                        if (i != 0) {
                                        }
                                        return s3q0.a;
                                    }
                                }

                                @Override // xsna.ksr
                                public final Object collect(lsr<? super List<? extends ClipsVideoItemLocation>> lsrVar, spj spjVar) {
                                    Object collect = nb9.this.collect(new AnonymousClass2(lsrVar, this), spjVar);
                                    return collect == CoroutineSingletons.COROUTINE_SUSPENDED ? collect : s3q0.a;
                                }
                            }, y9eVar);
                            obj2 = n;
                            if (n != coroutineSingletons) {
                                obj2 = (List) n;
                            }
                        } else {
                            obj2 = EmptyList.b;
                        }
                    }
                    obj = obj2;
                    if (obj != coroutineSingletons) {
                        z9eVar = this;
                    }
                    return coroutineSingletons;
                }
                if (i2 != 1) {
                    if (i2 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    z9eVar2 = (z9e) y9eVar.L$2;
                    kotlin.a.a(obj);
                    List<List<GeoLocation>> list3 = ((bqe) obj).a;
                    z9eVar2.getClass();
                    return k9q0.r(k9q0.v(list3));
                }
                i = y9eVar.I$0;
                z9eVar = (z9e) y9eVar.L$1;
                kotlin.a.a(obj);
                z9eVar.getClass();
                zpe zpeVar = new zpe(k9q0.u((List) obj), i);
                y9eVar.L$0 = null;
                y9eVar.L$1 = null;
                y9eVar.L$2 = this;
                y9eVar.I$0 = i;
                y9eVar.label = 2;
                obj = evj.p(zpeVar, y9eVar);
                if (obj != coroutineSingletons) {
                    z9eVar2 = this;
                    List<List<GeoLocation>> list32 = ((bqe) obj).a;
                    z9eVar2.getClass();
                    return k9q0.r(k9q0.v(list32));
                }
                return coroutineSingletons;
            }
        }
        y9eVar = new y9e(this, continuationImpl);
        obj = y9eVar.result;
        coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        i2 = y9eVar.label;
        if (i2 != 0) {
        }
        z9eVar.getClass();
        zpe zpeVar2 = new zpe(k9q0.u((List) obj), i);
        y9eVar.L$0 = null;
        y9eVar.L$1 = null;
        y9eVar.L$2 = this;
        y9eVar.I$0 = i;
        y9eVar.label = 2;
        obj = evj.p(zpeVar2, y9eVar);
        if (obj != coroutineSingletons) {
        }
        return coroutineSingletons;
    }
}
