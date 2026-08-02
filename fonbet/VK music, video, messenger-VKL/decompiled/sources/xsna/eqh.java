package xsna;

import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import com.vk.bridges.ImageViewer;
import com.vk.dto.attaches.AttachForMediaViewer;
import com.vk.dto.common.data.VKList;
import com.vk.dto.common.id.UserId;
import com.vk.dto.photo.Photo;
import com.vkontakte.android.api.ExtendedUserProfile;

/* compiled from: CommunityProfileLegoPhotosDelegate.kt */
/* loaded from: classes5.dex */
public final class eqh implements fsh {
    public final UserId a;
    public final ney<aj1, VKList<Photo>> b;
    public final ImageViewer c;
    public final neh d;
    public final io.reactivex.rxjava3.disposables.g e = new io.reactivex.rxjava3.disposables.g();

    public eqh(UserId userId, ney<aj1, VKList<Photo>> neyVar, ImageViewer imageViewer, neh nehVar) {
        this.a = userId;
        this.b = neyVar;
        this.c = imageViewer;
        this.d = nehVar;
    }

    @Override // xsna.fsh
    public final void a(Context context, ExtendedUserProfile extendedUserProfile, int i) {
        io.reactivex.rxjava3.disposables.g gVar = this.e;
        if (hg1.d(gVar.a())) {
            return;
        }
        int i2 = i < 0 ? 0 : i;
        neh nehVar = this.d;
        io.reactivex.rxjava3.core.q<R> L = nehVar.a(extendedUserProfile).L(new z7(new jeh(nehVar, i2, extendedUserProfile), 16), false);
        h60 h60Var = new h60(new nhe(nehVar, 5), 17);
        L.getClass();
        gVar.b(hg1.m(new io.reactivex.rxjava3.internal.operators.observable.a0(new io.reactivex.rxjava3.internal.operators.observable.a0(new io.reactivex.rxjava3.internal.operators.observable.c0(L, h60Var, io.reactivex.rxjava3.internal.functions.a.c), new vy3(nehVar, 2)), new sd6(this, 2)), context, 0L, false, 62).subscribe(new wn(new dqh(context, this, i, 0), 18), new xn(new ve0(19), 13)));
    }

    @Override // xsna.fsh
    public final void b(Context context, ExtendedUserProfile extendedUserProfile) {
        a(context, extendedUserProfile, 0);
    }

    @Override // xsna.fsh
    public final void c() {
        this.b.clear();
        neh nehVar = this.d;
        nehVar.d = null;
        nehVar.c.b(null);
    }

    @Override // xsna.fsh
    public final void dispose() {
        this.e.dispose();
    }

    /* compiled from: CommunityProfileLegoPhotosDelegate.kt */
    public final class a implements ImageViewer.a {
        public int a;
        public int b;
        public boolean c;
        public ImageViewer.c<Photo> d;
        public final io.reactivex.rxjava3.disposables.b e = new io.reactivex.rxjava3.disposables.b();

        public a(int i, int i2) {
            this.a = i;
            this.b = i2;
        }

        @Override // com.vk.bridges.ImageViewer.a
        public final View c(int i) {
            return null;
        }

        @Override // com.vk.bridges.ImageViewer.a
        public final Rect d(int i) {
            return null;
        }

        @Override // com.vk.bridges.ImageViewer.a
        public final Integer f() {
            return Integer.valueOf(this.b);
        }

        @Override // com.vk.bridges.ImageViewer.a
        public final Rect g() {
            return null;
        }

        @Override // com.vk.bridges.ImageViewer.a
        public final boolean h() {
            return true;
        }

        @Override // com.vk.bridges.ImageViewer.a
        public final String i() {
            return null;
        }

        @Override // com.vk.bridges.ImageViewer.a
        public final Context j() {
            return null;
        }

        @Override // com.vk.bridges.ImageViewer.a
        public final String m(int i, int i2) {
            return null;
        }

        @Override // com.vk.bridges.ImageViewer.a
        public final void o() {
            int i = this.a;
            if (i >= this.b || this.c) {
                return;
            }
            io.reactivex.rxjava3.internal.operators.observable.b0 G = new io.reactivex.rxjava3.internal.operators.observable.c0(rsg0.y0(new vea0(eqh.this.a, -6, i, 20, true), null, null, 3), new t00(new t3h(this, 2), 21), io.reactivex.rxjava3.internal.functions.a.c).G(new u00(this, 1));
            j22 j22Var = new j22(this, 20);
            int i2 = kwg0.a;
            this.e.b(G.subscribe(j22Var, new iwg0()));
        }

        @Override // com.vk.bridges.ImageViewer.a
        public final void onDismiss() {
            this.e.dispose();
            this.d = null;
        }

        @Override // com.vk.bridges.ImageViewer.a
        public final float[] q(int i) {
            return null;
        }

        @Override // com.vk.bridges.ImageViewer.a
        public final ImageViewer.d r() {
            return null;
        }

        @Override // com.vk.bridges.ImageViewer.a
        public final boolean s() {
            return true;
        }

        @Override // com.vk.bridges.ImageViewer.a
        public final void a() {
        }

        @Override // com.vk.bridges.ImageViewer.a
        public final void p() {
        }

        @Override // com.vk.bridges.ImageViewer.a
        public final void b(int i) {
        }

        @Override // com.vk.bridges.ImageViewer.a
        public final void e(int i) {
        }

        @Override // com.vk.bridges.ImageViewer.a
        public final void n(int i) {
        }

        @Override // com.vk.bridges.ImageViewer.a
        public final void t(Photo photo) {
        }

        @Override // com.vk.bridges.ImageViewer.a
        public final void v(AttachForMediaViewer attachForMediaViewer, ImageViewer.SwipeDirection swipeDirection, boolean z) {
        }
    }
}
