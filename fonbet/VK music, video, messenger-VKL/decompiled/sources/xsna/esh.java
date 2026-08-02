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
import io.reactivex.rxjava3.internal.functions.a;

/* compiled from: CommunityProfilePhotosDelegate.kt */
/* loaded from: classes5.dex */
public final class esh implements fsh {
    public final UserId a;
    public final ney<aj1, VKList<Photo>> b;
    public final ImageViewer c;
    public final io.reactivex.rxjava3.disposables.g d = new io.reactivex.rxjava3.disposables.g();
    public VKList<Photo> e;

    public esh(UserId userId, ney<aj1, VKList<Photo>> neyVar, ImageViewer imageViewer) {
        this.a = userId;
        this.b = neyVar;
        this.c = imageViewer;
    }

    @Override // xsna.fsh
    public final void a(Context context, ExtendedUserProfile extendedUserProfile, int i) {
        b(context, extendedUserProfile);
    }

    @Override // xsna.fsh
    public final void b(Context context, ExtendedUserProfile extendedUserProfile) {
        io.reactivex.rxjava3.core.q E;
        io.reactivex.rxjava3.disposables.g gVar = this.d;
        if (hg1.d(gVar.a())) {
            return;
        }
        UserId userId = this.a;
        aj1 aj1Var = new aj1(userId);
        if (this.e == null) {
            this.e = this.b.get(aj1Var);
        }
        VKList<Photo> vKList = this.e;
        if (vKList != null) {
            E = io.reactivex.rxjava3.core.q.T(vKList);
        } else {
            io.reactivex.rxjava3.internal.operators.observable.m1 y0 = rsg0.y0(new vea0(userId, -6, 0, 10, true), null, null, 3);
            mf1 mf1Var = new mf1(new v63(this, aj1Var, extendedUserProfile, 5), 16);
            a.l lVar = io.reactivex.rxjava3.internal.functions.a.d;
            a.k kVar = io.reactivex.rxjava3.internal.functions.a.c;
            E = y0.E(mf1Var, lVar, kVar, kVar);
        }
        gVar.b(hg1.m(new io.reactivex.rxjava3.internal.operators.observable.a0(E, new wyb(this, 1)), context, 0L, false, 62).U(new e7(new dkg(this, 5), 17)).subscribe(new sf(new ut6(8, context, this), 20), new tf(new oa(15), 18)));
    }

    @Override // xsna.fsh
    public final void c() {
        this.b.clear();
        this.e = null;
    }

    @Override // xsna.fsh
    public final void dispose() {
        this.d.dispose();
    }

    /* compiled from: CommunityProfilePhotosDelegate.kt */
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
            io.reactivex.rxjava3.internal.operators.observable.b0 G = new io.reactivex.rxjava3.internal.operators.observable.c0(rsg0.y0(new vea0(esh.this.a, -6, i, 20, true), null, null, 3), new ji3(new nvg(this, 5), 19), io.reactivex.rxjava3.internal.functions.a.c).G(new dh1(this, 2));
            np3 np3Var = new np3(this, 13);
            int i2 = kwg0.a;
            this.e.b(G.subscribe(np3Var, new iwg0()));
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
