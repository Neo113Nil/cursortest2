package xsna;

import android.app.Activity;
import android.content.Intent;
import com.vk.api.generated.users.dto.UsersContentTypeDto;
import com.vk.dto.common.data.VKList;
import com.vk.dto.common.id.UserId;
import com.vk.dto.photo.Photo;
import com.vk.dto.photo.PhotoAlbum;
import com.vk.photos.root.common.PhotoUploadInteractor;
import com.vk.profile.core.tabs.state.CommunityProfileContentItem;
import com.vk.profile.user.impl.ui.UserProfileAction;
import com.vk.profile.user.impl.ui.f;
import com.vkontakte.android.R;
import com.vkontakte.android.api.ExtendedUserProfile;
import com.vungle.ads.internal.protos.Sdk;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.FunctionReferenceImpl;
import org.chromium.net.NetError;
import xsna.atq0;
import xsna.cvd0;
import xsna.hg1;
import xsna.it80;

/* compiled from: UserProfileContentPhotoFeatureDelegate.kt */
/* loaded from: classes5.dex */
public final class onq0 extends wmq0<iea0, s3q0> {
    public final rnq0 m;
    public final PhotoUploadInteractor.a n;
    public Integer o;
    public final String p;

    /* compiled from: UserProfileContentPhotoFeatureDelegate.kt */
    public static final /* synthetic */ class a extends FunctionReferenceImpl implements izs<Pair<? extends VKList<PhotoAlbum>, ? extends Boolean>, it80<Pair<? extends VKList<PhotoAlbum>, ? extends Boolean>>> {
        @Override // xsna.izs
        public final it80<Pair<? extends VKList<PhotoAlbum>, ? extends Boolean>> invoke(Pair<? extends VKList<PhotoAlbum>, ? extends Boolean> pair) {
            ((it80.a) this.receiver).getClass();
            return new it80<>(pair);
        }
    }

    /* compiled from: UserProfileContentPhotoFeatureDelegate.kt */
    public static final /* synthetic */ class b extends FunctionReferenceImpl implements izs<VKList<Photo>, it80<VKList<Photo>>> {
        @Override // xsna.izs
        public final it80<VKList<Photo>> invoke(VKList<Photo> vKList) {
            ((it80.a) this.receiver).getClass();
            return new it80<>(vKList);
        }
    }

    public onq0(dvq0 dvq0Var, r0e0 r0e0Var, boolean z, rnq0 rnq0Var, PhotoUploadInteractor.a aVar) {
        super(dvq0Var, r0e0Var, z);
        this.m = rnq0Var;
        this.n = aVar;
        this.p = "photos";
    }

    @Override // xsna.wmq0
    public final void A(iea0 iea0Var, CommunityProfileContentItem.State state, CommunityProfileContentItem.State state2) {
        iea0 iea0Var2 = iea0Var;
        if (state == null) {
            state = iea0Var2.s;
        }
        CommunityProfileContentItem.State state3 = state;
        if (state2 == null) {
            state2 = iea0Var2.u;
        }
        z(iea0.i(iea0Var2, null, null, null, null, false, false, null, state3, state2, 13823));
    }

    public final void C() {
        fpq0 fpq0Var = this.g;
        if (fpq0Var == null) {
            fpq0Var = null;
        }
        fpq0Var.B(new f.h(new atq0.d(Integer.valueOf(R.string.photo_flow_photos_upload_error), null, null, Integer.valueOf(R.drawable.vk_icon_warning_triangle_outline_28), R.attr.vk_ui_accent_orange, null, null, 230)));
    }

    public final void D(iea0 iea0Var, boolean z) {
        io.reactivex.rxjava3.core.b0 b2;
        CommunityProfileContentItem.ContentType contentType = iea0Var.l;
        boolean z2 = (contentType.i() && z) || contentType.h();
        boolean h = contentType.h();
        r0e0 r0e0Var = this.c;
        rnq0 rnq0Var = this.m;
        if (z2) {
            UserId a2 = r0e0Var.a();
            int i = contentType.h() ? 30 : 6;
            cvd0.c cVar = iea0Var.k;
            b2 = io.reactivex.rxjava3.core.x.j(rnq0Var.c(i, a2, cVar != null ? cVar.a.size() : 0)).l(new uq80(new a(1, it80.b, it80.a.class, "of", "of(Ljava/lang/Object;)Lcom/vk/core/util/Optional;", 0), 6));
        } else {
            b2 = tr.b(it80.b);
        }
        p(io.reactivex.rxjava3.core.x.B(!h ? io.reactivex.rxjava3.core.x.j(rnq0Var.d(r0e0Var.a(), iea0Var.p)).l(new uf20(new b(1, it80.b, it80.a.class, "of", "of(Ljava/lang/Object;)Lcom/vk/core/util/Optional;", 0), 15)) : tr.b(it80.b), b2, new osk0(new xdi(3), 6)), new fkj(this, iea0Var, z, 3), new vhm0(this, iea0Var, z, 1));
    }

    @Override // xsna.wmq0, xsna.huq
    public final void J(com.vk.profile.user.impl.ui.g gVar, UserProfileAction.a aVar) {
        int i = aVar.b;
        if (aVar.a() && i == 23) {
            com.vk.photos.root.common.a a2 = this.n.a(NetError.ERR_ECH_NOT_NEGOTIATED, this.c.a());
            int i2 = aVar.c;
            Intent intent = aVar.d;
            io.reactivex.rxjava3.disposables.b bVar = this.e;
            if (bVar == null) {
                bVar = null;
            }
            Integer a3 = a2.a(i, i2, intent, bVar);
            if (a3 == null) {
                C();
            } else {
                this.o = a3;
            }
        }
    }

    @Override // xsna.wmq0, xsna.rgq0
    public final void b(CommunityProfileContentItem communityProfileContentItem) {
        iea0 iea0Var = (iea0) communityProfileContentItem;
        if (iea0Var.n) {
            wmq0.B(this, iea0Var, null, CommunityProfileContentItem.State.LOADING, 2);
            D(iea0Var, false);
        }
    }

    @Override // xsna.wmq0, xsna.rgq0
    public final void e(CommunityProfileContentItem communityProfileContentItem) {
        z(iea0.i((iea0) communityProfileContentItem, null, null, null, null, false, false, null, null, null, 8191));
    }

    @Override // xsna.wmq0, xsna.rgq0
    public final void f(CommunityProfileContentItem communityProfileContentItem, ExtendedUserProfile extendedUserProfile) {
        if (extendedUserProfile != null) {
            fpq0 fpq0Var = this.g;
            if (fpq0Var == null) {
                fpq0Var = null;
            }
            fpq0Var.B(new f.e.t(extendedUserProfile));
        }
    }

    @Override // xsna.wmq0, xsna.rgq0
    public final void g(CommunityProfileContentItem communityProfileContentItem, ExtendedUserProfile extendedUserProfile) {
        if (extendedUserProfile != null) {
            fpq0 fpq0Var = this.g;
            if (fpq0Var == null) {
                fpq0Var = null;
            }
            fpq0Var.B(new f.e.x(extendedUserProfile));
        }
    }

    @Override // xsna.wmq0, xsna.rgq0
    public final void l(CommunityProfileContentItem communityProfileContentItem, ExtendedUserProfile extendedUserProfile) {
        if (extendedUserProfile != null) {
            fpq0 fpq0Var = this.g;
            if (fpq0Var == null) {
                fpq0Var = null;
            }
            fpq0Var.B(new f.e.w0(extendedUserProfile));
        }
    }

    @Override // xsna.wmq0, xsna.huq
    public final void m(Activity activity) {
        if (this.b.a(this.c.a())) {
            io.reactivex.rxjava3.subjects.f<Object> fVar = ysg0.b.a;
            hg1.f4 f4Var = new hg1.f4();
            fVar.getClass();
            io.reactivex.rxjava3.disposables.c subscribe = new io.reactivex.rxjava3.internal.operators.observable.i0(new io.reactivex.rxjava3.internal.operators.observable.i0(fVar, f4Var), new nlf0(new u5p0(this, 3), 7)).subscribe(new vk40(new h440(this, 25), 24));
            io.reactivex.rxjava3.disposables.b bVar = this.e;
            if (bVar == null) {
                bVar = null;
            }
            bVar.b(subscribe);
        }
    }

    @Override // xsna.wmq0, xsna.rgq0
    public final void n(CommunityProfileContentItem communityProfileContentItem, ExtendedUserProfile extendedUserProfile) {
        if (extendedUserProfile != null) {
            fpq0 fpq0Var = this.g;
            if (fpq0Var == null) {
                fpq0Var = null;
            }
            fpq0Var.B(new f.e.x(extendedUserProfile));
        }
    }

    @Override // xsna.wmq0
    public final CommunityProfileContentItem q(CommunityProfileContentItem communityProfileContentItem) {
        return iea0.i((iea0) communityProfileContentItem, null, null, null, null, false, false, null, CommunityProfileContentItem.State.RELOAD, CommunityProfileContentItem.State.INITIAL, 13700);
    }

    @Override // xsna.wmq0
    public final iea0 s(ExtendedUserProfile.m mVar, boolean z, boolean z2) {
        String str = mVar.a;
        String str2 = this.p;
        if (str.equals(str2)) {
            List<UsersContentTypeDto> list = mVar.e;
            List<UsersContentTypeDto> list2 = list;
            return new iea0((list2 == null || list2.isEmpty()) ? CommunityProfileContentItem.ContentType.ITEMS : (list.size() == 1 && list.contains(UsersContentTypeDto.PHOTOS_ALBUMS)) ? CommunityProfileContentItem.ContentType.ALBUMS : (list.size() == 1 && list.contains(UsersContentTypeDto.PHOTOS)) ? CommunityProfileContentItem.ContentType.ITEMS : CommunityProfileContentItem.ContentType.MIXED, wmq0.y(this, mVar, R.string.user_content_photos_empty, Integer.valueOf(R.string.community_content_add_photo), false, null, 20), new CommunityProfileContentItem.c(R.string.community_content_photos_error), z ? CommunityProfileContentItem.State.RELOAD : CommunityProfileContentItem.State.INITIAL, wmq0.u(this, mVar, R.string.community_content_add_photo, 0, false, Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE), CommunityProfileContentItem.State.INITIAL, mVar.b, 8192);
        }
        throw new IllegalArgumentException(("Provide " + mVar + " expected name was " + str2).toString());
    }

    @Override // xsna.wmq0
    public final io.reactivex.rxjava3.core.q<s3q0> t() {
        return this.m.m();
    }

    @Override // xsna.wmq0
    public final String v() {
        return this.p;
    }

    @Override // xsna.wmq0
    public final /* bridge */ /* synthetic */ void w(CommunityProfileContentItem communityProfileContentItem) {
        D((iea0) communityProfileContentItem, true);
    }
}
