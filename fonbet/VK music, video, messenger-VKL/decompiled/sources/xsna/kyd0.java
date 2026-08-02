package xsna;

import android.content.Context;
import android.os.Bundle;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import com.vk.api.generated.groups.dto.GroupsFieldsDto;
import com.vk.core.ui.tracking.UiTracker;
import com.vk.dto.common.data.VKList;
import com.vk.dto.common.id.UserId;
import com.vk.dto.newsfeed.Owner;
import com.vk.dto.photo.Photo;
import com.vk.dto.photo.PhotoAlbum;
import com.vk.dto.photo.PhotoTag;
import com.vk.dto.user.UserProfile;
import com.vk.log.L;
import com.vk.photos.ui.profile.ProfileMainPhotosFragment;
import com.vk.photos.ui.profile.ProfilePhotoTag;
import com.vk.toggle.features.ComFeatures;
import com.vkontakte.android.R;
import com.vkontakte.android.data.b;
import io.reactivex.rxjava3.internal.functions.a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.internal.FunctionReferenceImpl;
import ru.ok.android.utils.Logger;
import xsna.oap;
import xsna.pdv0;
import xsna.xqu;

/* compiled from: ProfileMainPhotosPresenter.kt */
/* loaded from: classes3.dex */
public final class kyd0 extends vj6<gyd0> implements nca0 {
    public final dzd0 l;
    public ArrayList<ProfilePhotoTag> m;
    public boolean n;
    public final Object o;

    /* compiled from: ProfileMainPhotosPresenter.kt */
    public static final /* synthetic */ class a extends FunctionReferenceImpl implements izs<Throwable, s3q0> {
        @Override // xsna.izs
        public final s3q0 invoke(Throwable th) {
            L.i(th);
            return s3q0.a;
        }
    }

    /* compiled from: ProfileMainPhotosPresenter.kt */
    public static final /* synthetic */ class b extends FunctionReferenceImpl implements izs<Throwable, s3q0> {
        @Override // xsna.izs
        public final s3q0 invoke(Throwable th) {
            L.i(th);
            return s3q0.a;
        }
    }

    public kyd0(ProfileMainPhotosFragment profileMainPhotosFragment) {
        super(profileMainPhotosFragment);
        this.l = new dzd0(this, profileMainPhotosFragment, new e2s(profileMainPhotosFragment, 24));
        this.m = new ArrayList<>();
        this.o = msy.a(LazyThreadSafetyMode.NONE, new cy0(23, profileMainPhotosFragment, this));
    }

    @Override // xsna.nca0
    public final void F4(ProfilePhotoTag profilePhotoTag) {
        io.reactivex.rxjava3.core.x w0;
        Object obj;
        dzd0 dzd0Var = this.l;
        dzd0Var.getClass();
        int i = profilePhotoTag.k;
        Photo photo = profilePhotoTag.b;
        boolean z = profilePhotoTag.d;
        if (z) {
            Iterator<T> it = photo.b.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                } else {
                    obj = it.next();
                    if (((PhotoTag) obj).b == i) {
                        break;
                    }
                }
            }
            PhotoTag photoTag = (PhotoTag) obj;
            if (photoTag != null) {
                String str = profilePhotoTag.m;
                UiTracker uiTracker = UiTracker.a;
                w0 = rsg0.w0(new oea0(profilePhotoTag.b, photoTag, !z, str, UiTracker.d()));
            }
            w0 = null;
        } else {
            Owner owner = profilePhotoTag.c;
            if (owner != null) {
                w0 = rsg0.w0(new nea0(owner.b, photo.c, i));
            }
            w0 = null;
        }
        if (w0 == null) {
            w0 = io.reactivex.rxjava3.core.x.k(Boolean.FALSE);
        }
        dzd0Var.a.a(hg1.n(w0.m(io.reactivex.rxjava3.android.schedulers.a.b()), dzd0Var.b.getActivity(), false, null, 60).subscribe(new g600(new kp5(21, dzd0Var, profilePhotoTag), 17), new lkz(new xmz(24), 14)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.fj6
    public final io.reactivex.rxjava3.core.q<VKList<Photo>> O(oap<Integer, String> oapVar, int i) {
        if (!(oapVar instanceof oap.a)) {
            throw new IllegalStateException("You must use pagination with offset or change paginationType");
        }
        io.reactivex.rxjava3.internal.operators.observable.m1 y0 = rsg0.y0(new zea0(this.f, ((Number) ((oap.a) oapVar).a).intValue(), i), null, null, 3);
        w250 w250Var = new w250(new bk30(this, 24), 11);
        a.l lVar = io.reactivex.rxjava3.internal.functions.a.d;
        a.k kVar = io.reactivex.rxjava3.internal.functions.a.c;
        return y0.E(w250Var, lVar, kVar, kVar);
    }

    @Override // xsna.vj6, xsna.gm6
    public final void d() {
        super.d();
        io.reactivex.rxjava3.subjects.f<Object> fVar = ysg0.b.a;
        k73 k73Var = new k73(28);
        fVar.getClass();
        a(new io.reactivex.rxjava3.internal.operators.observable.i0(fVar, k73Var).a0(asu0.a.d()).subscribe(new o060(this, 10)));
        a(v7(false).subscribe(new b8v(new iyd0(this, 0), 21), new ca10(new b(1, L.a, L.class, Logger.METHOD_E, "e(Ljava/lang/Throwable;)V", 0), 14)));
    }

    @Override // xsna.vj6, xsna.fj6
    public final void h() {
        a(v7(true).subscribe(new fv70(new es00(this, 29), 8), new l8w(new a(1, L.a, L.class, Logger.METHOD_E, "e(Ljava/lang/Throwable;)V", 0), 18)));
    }

    @Override // xsna.vj6, xsna.fj6
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        UserId userId = this.f;
        PhotoAlbum photoAlbum = new PhotoAlbum();
        Context context = e43.a;
        if (context == null) {
            context = null;
        }
        photoAlbum.g = context.getString(R.string.all_photos);
        photoAlbum.b = -9002;
        photoAlbum.c = userId;
        this.g = photoAlbum;
        bundle.getBoolean("show_new_tags", false);
        String string = bundle.getString("source");
        UserId userId2 = this.f;
        String str = userId2.b >= 0 ? "photo_catalog_user" : "photo_catalog_community";
        b.d dVar = new b.d("open_screen");
        dVar.b(str, "name");
        dVar.b(userId2, "owner_id");
        dVar.b(string, "source");
        dVar.e();
        a(ysg0.b.a.subscribe(new k130(this, 17)));
    }

    @Override // xsna.nca0
    public final void s2(ProfilePhotoTag profilePhotoTag) {
        Object obj;
        io.reactivex.rxjava3.core.t U;
        dzd0 dzd0Var = this.l;
        ProfileMainPhotosFragment profileMainPhotosFragment = dzd0Var.b;
        Owner owner = profilePhotoTag.c;
        Photo photo = profilePhotoTag.b;
        PhotoTag photoTag = (PhotoTag) j5g.a0(photo.b);
        if (photoTag == null) {
            return;
        }
        UserId userId = photoTag.d;
        if (profilePhotoTag.d) {
            pdv0.a b2 = vtk0.c().b(photo);
            b2.z(photoTag);
            b2.l(profileMainPhotosFragment);
            return;
        }
        if (owner == null || (obj = owner.b) == null) {
            obj = 0;
        }
        String[] strArr = {"sex"};
        io.reactivex.rxjava3.core.q y0 = (!epx.f(userId, obj) || owner == null) ? rsg0.y0(new e1r0(userId, strArr), null, null, 3) : io.reactivex.rxjava3.core.q.T(new UserProfile(owner));
        if (epx.f(photo.e, obj)) {
            U = io.reactivex.rxjava3.core.q.T(new UserProfile(owner));
        } else if (fkq0.d(photo.e)) {
            U = rsg0.y0(new e1r0(photo.e, strArr), null, null, 3);
        } else {
            ComFeatures comFeatures = ComFeatures.COM_GROUPS_GETBYID_CODEGEN;
            comFeatures.getClass();
            int i = 19;
            if (com.vk.toggle.b.A.a(comFeatures)) {
                List singletonList = Collections.singletonList(fkq0.a(photo.e));
                List l = e43.l(GroupsFieldsDto.MEMBERS_COUNT, GroupsFieldsDto.IS_CLOSED, GroupsFieldsDto.START_DATE, GroupsFieldsDto.CAN_MESSAGE, GroupsFieldsDto.IS_MESSAGES_BLOCKED, GroupsFieldsDto.MEMBER_STATUS, GroupsFieldsDto.BAN_INFO, GroupsFieldsDto.IS_MARKET_CART_ENABLED, GroupsFieldsDto.ENABLED_FEATURES);
                if ((4 & 2) != 0) {
                    l = null;
                }
                fz2 y = yfb.y(xqu.a.a(null, singletonList, l), new byo(i));
                ahn.D(y);
                U = rsg0.y0(y, null, null, 3).U(new tuz(new zsw(16), 11));
            } else {
                U = rsg0.y0(new rpu(fkq0.e(photo.e)), null, null, 3).U(new he40(new uuz(19), 6));
            }
        }
        int i2 = 8;
        io.reactivex.rxjava3.core.q m = hg1.m(io.reactivex.rxjava3.core.q.I0(y0, U, new ie40(new kxa((byte) 0, 6), i2)).a0(io.reactivex.rxjava3.android.schedulers.a.b()), profileMainPhotosFragment.getActivity(), 0L, false, 62);
        skz skzVar = new skz(new yw5(photo, photoTag, dzd0Var, i2), 20);
        int i3 = kwg0.a;
        dzd0Var.a.a(m.subscribe(skzVar, new iwg0()));
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
    public final io.reactivex.rxjava3.internal.operators.single.l v7(boolean z) {
        this.n = z;
        UserId userId = qr.f(this.f) ? UserId.d : this.f;
        r6m.a.getClass();
        return rsg0.w0(new xea0(userId, true, new yea0(R.string.user_photos_title, R.string.all_photos, r6m.k()), 0, 0, PsExtractor.VIDEO_STREAM_MASK)).m(io.reactivex.rxjava3.android.schedulers.a.b()).h((io.reactivex.rxjava3.functions.f) this.o.getValue());
    }

    @Override // xsna.nca0
    public final void x(ProfilePhotoTag profilePhotoTag) {
        io.reactivex.rxjava3.core.x w0;
        Object obj;
        dzd0 dzd0Var = this.l;
        dzd0Var.getClass();
        int i = profilePhotoTag.k;
        Photo photo = profilePhotoTag.b;
        if (profilePhotoTag.d) {
            Iterator<T> it = photo.b.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                } else {
                    obj = it.next();
                    if (((PhotoTag) obj).b == i) {
                        break;
                    }
                }
            }
            PhotoTag photoTag = (PhotoTag) obj;
            if (photoTag != null) {
                String str = profilePhotoTag.m;
                UiTracker uiTracker = UiTracker.a;
                w0 = rsg0.w0(new oss0(photo, photoTag, str, UiTracker.d()));
            }
            w0 = null;
        } else {
            Owner owner = profilePhotoTag.c;
            if (owner != null) {
                w0 = rsg0.w0(new is(owner.b, photo.c, i));
            }
            w0 = null;
        }
        if (w0 == null) {
            w0 = io.reactivex.rxjava3.core.x.k(Boolean.FALSE);
        }
        dzd0Var.a.a(hg1.n(w0.m(io.reactivex.rxjava3.android.schedulers.a.b()), dzd0Var.b.getActivity(), false, null, 60).subscribe(new ljs(new z5a(23, dzd0Var, profilePhotoTag), 21), new j3z(new viu(16), 15)));
    }

    @Override // xsna.vj6, xsna.cc6
    public final void onPause() {
    }

    @Override // xsna.vj6, xsna.cc6
    public final void onResume() {
    }
}
