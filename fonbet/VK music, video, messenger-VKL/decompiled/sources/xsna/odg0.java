package xsna;

import android.content.Context;
import android.graphics.ColorFilter;
import android.graphics.PorterDuffColorFilter;
import com.vk.dto.common.Attachment;
import com.vk.dto.common.restrictions.PhotoRestriction;
import com.vk.dto.common.restrictions.RestrictionButton;
import com.vk.dto.photo.Photo;
import com.vk.feed.core.models.attachment.EntryAttachment;
import com.vk.lists.ListDataSet;
import com.vkontakte.android.R;
import com.vkontakte.android.attachments.PhotoAttachment;
import com.vkontakte.android.attachments.ShitAttachment;
import com.vungle.ads.internal.protos.Sdk;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;
import java.util.concurrent.Callable;
import kotlin.Pair;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.f5h0;
import xsna.h7u0;

/* compiled from: RestrictionsUtilsImpl.kt */
/* loaded from: classes5.dex */
public final class odg0 implements kdg0 {
    public static final odg0 a = new odg0();
    public static final bpn0 b = new bpn0(new l35(24));
    public static final bpn0 c = new bpn0(new c2c0(7));

    /* compiled from: RestrictionsUtilsImpl.kt */
    public static final /* synthetic */ class a extends FunctionReferenceImpl implements izs<Throwable, s3q0> {
        @Override // xsna.izs
        public final s3q0 invoke(Throwable th) {
            ((com.vk.metrics.eventtracking.b) this.receiver).a(th);
            return s3q0.a;
        }
    }

    /* compiled from: RestrictionsUtilsImpl.kt */
    public static final /* synthetic */ class b extends FunctionReferenceImpl implements izs<Throwable, s3q0> {
        @Override // xsna.izs
        public final s3q0 invoke(Throwable th) {
            ((com.vk.metrics.eventtracking.b) this.receiver).a(th);
            return s3q0.a;
        }
    }

    /* compiled from: RestrictionsUtilsImpl.kt */
    public static final /* synthetic */ class c extends FunctionReferenceImpl implements izs<Photo, s3q0> {
        @Override // xsna.izs
        public final s3q0 invoke(Photo photo) {
            Photo photo2 = photo;
            odg0 odg0Var = (odg0) this.receiver;
            odg0 odg0Var2 = odg0.a;
            odg0Var.getClass();
            if (photo2.Hb()) {
                photo2.L = null;
            }
            return s3q0.a;
        }
    }

    /* compiled from: RestrictionsUtilsImpl.kt */
    public static final /* synthetic */ class d extends FunctionReferenceImpl implements izs<Throwable, s3q0> {
        @Override // xsna.izs
        public final s3q0 invoke(Throwable th) {
            ((com.vk.metrics.eventtracking.b) this.receiver).a(th);
            return s3q0.a;
        }
    }

    /* compiled from: RestrictionsUtilsImpl.kt */
    public static final /* synthetic */ class e extends FunctionReferenceImpl implements izs<Photo, s3q0> {
        @Override // xsna.izs
        public final s3q0 invoke(Photo photo) {
            Photo photo2 = photo;
            odg0 odg0Var = (odg0) this.receiver;
            odg0 odg0Var2 = odg0.a;
            odg0Var.getClass();
            if (photo2.Hb()) {
                photo2.L = null;
            }
            return s3q0.a;
        }
    }

    public static void l(zjt zjtVar) {
        if (zjtVar != null) {
            zjtVar.setVkPostprocessor(null);
        }
        if (zjtVar != null) {
            zjtVar.setActualColorFilter((ColorFilter) null);
        }
        if (zjtVar != null) {
            zjtVar.setOverlayImage(null);
        }
    }

    public static io.reactivex.rxjava3.disposables.c m(final List list, final izs izsVar, final izs izsVar2, izs izsVar3) {
        io.reactivex.rxjava3.internal.operators.observable.s0 s0Var = new io.reactivex.rxjava3.internal.operators.observable.s0(new Callable(list, izsVar, izsVar2) { // from class: xsna.ldg0
            public final /* synthetic */ List b;
            public final /* synthetic */ izs c;
            public final /* synthetic */ FunctionReferenceImpl d;

            /* JADX WARN: Multi-variable type inference failed */
            {
                this.d = (FunctionReferenceImpl) izsVar2;
            }

            /* JADX WARN: Type inference failed for: r5v4, types: [kotlin.jvm.internal.FunctionReferenceImpl, xsna.izs] */
            @Override // java.util.concurrent.Callable
            public final Object call() {
                ArrayList arrayList = new ArrayList();
                int i = 0;
                for (Object obj : this.b) {
                    int i2 = i + 1;
                    if (i < 0) {
                        e43.t();
                        throw null;
                    }
                    if (((Boolean) this.c.invoke(obj)).booleanValue()) {
                        this.d.invoke(obj);
                        arrayList.add(new Pair(Integer.valueOf(i), obj));
                    }
                    i = i2;
                }
                return arrayList;
            }
        });
        asu0.a.getClass();
        return s0Var.r0(asu0.i()).a0(io.reactivex.rxjava3.android.schedulers.a.b()).subscribe(new tl30(new l1e(izsVar3, 3), 19), new pw40(new b(1, com.vk.metrics.eventtracking.b.a, com.vk.metrics.eventtracking.b.class, "logException", "logException(Ljava/lang/Throwable;)V", 0), 7));
    }

    public static io.reactivex.rxjava3.disposables.c n(List list, ListDataSet listDataSet, izs izsVar) {
        io.reactivex.rxjava3.internal.operators.observable.s0 s0Var = new io.reactivex.rxjava3.internal.operators.observable.s0(new c8s(list, listDataSet, izsVar, 1));
        asu0.a.getClass();
        return s0Var.r0(asu0.i()).a0(io.reactivex.rxjava3.android.schedulers.a.b()).subscribe(new g600(new t440(listDataSet, 19), 21), new kjs(new d(1, com.vk.metrics.eventtracking.b.a, com.vk.metrics.eventtracking.b.class, "logException", "logException(Ljava/lang/Throwable;)V", 0), 16));
    }

    public static boolean o(ShitAttachment shitAttachment, izs izsVar) {
        PhotoAttachment photoAttachment = shitAttachment.H;
        if (photoAttachment == null) {
            return false;
        }
        Photo photo = photoAttachment.l;
        if (!((Boolean) izsVar.invoke(photoAttachment)).booleanValue()) {
            return false;
        }
        if (!photo.Hb()) {
            return true;
        }
        photo.L = null;
        return true;
    }

    public static boolean p(fsx0 fsx0Var, izs izsVar) {
        List<EntryAttachment> N7 = fsx0Var.N7();
        boolean z = false;
        z = false;
        if (N7 != null) {
            List<EntryAttachment> list = N7;
            if (list instanceof RandomAccess) {
                List<EntryAttachment> list2 = list;
                int size = list2.size();
                boolean z2 = false;
                for (int i = 0; i < size; i++) {
                    Attachment attachment = list2.get(i).b;
                    if ((attachment instanceof PhotoAttachment) && ((Boolean) izsVar.invoke(attachment)).booleanValue()) {
                        PhotoAttachment photoAttachment = (PhotoAttachment) attachment;
                        if (photoAttachment.l.Hb()) {
                            photoAttachment.l.L = null;
                        }
                        z2 = true;
                    }
                }
                return z2;
            }
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                Attachment attachment2 = ((EntryAttachment) it.next()).b;
                if ((attachment2 instanceof PhotoAttachment) && ((Boolean) izsVar.invoke(attachment2)).booleanValue()) {
                    PhotoAttachment photoAttachment2 = (PhotoAttachment) attachment2;
                    if (photoAttachment2.l.Hb()) {
                        photoAttachment2.l.L = null;
                    }
                    z = true;
                }
            }
        }
        return z;
    }

    @Override // xsna.kdg0
    public final baf0 a(PhotoRestriction photoRestriction) {
        if (photoRestriction == null) {
            return null;
        }
        return photoRestriction.d ? new baf0(dhr0.t.a(R.drawable.vk_icon_hide_outline_28), -1) : dhr0.t.b(R.drawable.vk_icon_block_outline_28, R.attr.vk_ui_vkontakte_color_placeholder_icon_foreground_primary);
    }

    @Override // xsna.kdg0
    public final io.reactivex.rxjava3.disposables.c b(List<? extends Photo> list, Photo photo, izs<? super List<? extends Pair<Integer, ? extends Photo>>, s3q0> izsVar) {
        return m(list, new rxz(photo, 22), new e(1, a, odg0.class, "unblurPhoto", "unblurPhoto(Lcom/vk/dto/photo/Photo;)V", 0), izsVar);
    }

    @Override // xsna.kdg0
    public final void c(zjt zjtVar, Photo photo) {
        k(zjtVar, photo != null ? photo.L : null, true, false, new gd70(photo != null ? photo.y : null, 22));
    }

    @Override // xsna.kdg0
    public final void d(zjt<?> zjtVar, PhotoRestriction photoRestriction, boolean z, boolean z2, gzs<String> gzsVar) {
        k(zjtVar, photoRestriction, z, z2, gzsVar);
    }

    @Override // xsna.kdg0
    public final io.reactivex.rxjava3.disposables.c e(List<? extends Photo> list, Photo photo, izs<? super List<? extends Pair<Integer, ? extends Photo>>, s3q0> izsVar) {
        return m(list, new arb0(photo, 8), new c(1, a, odg0.class, "unblurPhoto", "unblurPhoto(Lcom/vk/dto/photo/Photo;)V", 0), izsVar);
    }

    @Override // xsna.kdg0
    public final void f(zjt<?> zjtVar) {
        l(zjtVar);
    }

    @Override // xsna.kdg0
    public final void g(Photo photo) {
        p870 f = p870.f();
        f.e(Sdk.SDKError.Reason.MRAID_JS_WRITE_FAILED_VALUE, photo);
        rsg0.y0(yfb.x(((zga0) c.getValue()).h(photo.c, photo.e)), null, null, 3).subscribe(new qw40(new ndg0(0, f, photo), 12), new rt10(new a(1, com.vk.metrics.eventtracking.b.a, com.vk.metrics.eventtracking.b.class, "logException", "logException(Ljava/lang/Throwable;)V", 0), 12));
    }

    @Override // xsna.kdg0
    public final void h(Context context, Photo photo) {
        RestrictionButton restrictionButton;
        int i = h7u0.p;
        h7u0.a a2 = h7u0.b.a(context);
        PhotoRestriction photoRestriction = photo.L;
        String str = null;
        a2.h0(photoRestriction != null ? photoRestriction.b : null);
        PhotoRestriction photoRestriction2 = photo.L;
        a2.a.f = photoRestriction2 != null ? photoRestriction2.c : null;
        a2.W(R.string.restriction_cancel, null);
        PhotoRestriction photoRestriction3 = photo.L;
        if (photoRestriction3 != null && (restrictionButton = photoRestriction3.e) != null) {
            str = restrictionButton.c;
        }
        a2.d0(str, new ls1(photo, 1));
        a2.m();
    }

    @Override // xsna.kdg0
    public final void i(zjt<?> zjtVar, Photo photo, boolean z, yzs<? super Photo, ? super Integer, ? super Integer, String> yzsVar) {
        if (zjtVar != null) {
            bwt0.S(zjtVar, new shh(photo, z, yzsVar));
        }
    }

    public final void k(zjt<?> zjtVar, PhotoRestriction photoRestriction, boolean z, boolean z2, gzs<String> gzsVar) {
        String str;
        if (photoRestriction == null) {
            return;
        }
        baf0 a2 = z ? a(photoRestriction) : edg0.a(photoRestriction, null);
        if (photoRestriction.d) {
            str = gzsVar.invoke();
            jwx jwxVar = z2 ? edg0.c : edg0.a;
            if (zjtVar != null) {
                zjtVar.setActualColorFilter((PorterDuffColorFilter) b.getValue());
            }
            if (zjtVar != null) {
                kci.o(zjtVar, jwxVar);
            }
        } else {
            if (zjtVar != null) {
                zjtVar.setVkPostprocessor(null);
            }
            str = null;
        }
        a5h0 a5h0Var = a2 != null ? new a5h0(a2, f5h0.g.a) : null;
        if (zjtVar != null) {
            zjtVar.setOverlayImage(a5h0Var);
        }
        if (zjtVar != null) {
            zjtVar.load(str);
        }
    }
}
