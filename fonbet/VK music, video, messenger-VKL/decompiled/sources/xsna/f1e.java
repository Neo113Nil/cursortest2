package xsna;

import android.graphics.Bitmap;
import com.ironsource.C4243ba;
import com.ironsource.X3;
import com.vk.api.generated.groups.dto.GroupsFieldsDto;
import com.vk.dto.common.id.UserId;
import com.vk.dto.common.im.Image;
import com.vk.dto.common.im.ImageList;
import com.vk.media.MediaUtils;
import com.vk.toggle.features.ComFeatures;
import java.util.Collections;
import java.util.List;
import xsna.xqu;

/* compiled from: ClipsEditorWatermarkProviderImpl.kt */
/* loaded from: classes16.dex */
public final class f1e {
    /* JADX WARN: Multi-variable type inference failed */
    public final gny a(MediaUtils.d dVar) {
        cn o = o25.a().o();
        UserId userId = o.a;
        int b = an10.b(dVar.a * 0.192f);
        ImageList imageList = o.i;
        Image Cb = imageList != null ? imageList.Cb(b, true) : null;
        Bitmap bitmap = Cb != null ? (Bitmap) mcr0.m(Cb.b / 2, -1L, Cb.d).a() : null;
        String str = o.h;
        if (str == null) {
            str = b4q.b(userId, "id");
        }
        gny gnyVar = new gny(userId, o.b, go9.b("@", str), null);
        gnyVar.d = bitmap;
        return gnyVar;
    }

    public final io.reactivex.rxjava3.internal.operators.single.r b(UserId userId, boolean z) {
        io.reactivex.rxjava3.internal.operators.observable.f0 K;
        io.reactivex.rxjava3.internal.operators.single.y l;
        if (userId == null) {
            userId = o25.a().c();
        }
        String[] strArr = {X3.j.D, "photo_base"};
        String str = z ? C4243ba.n : "nom";
        if (fkq0.d(userId)) {
            l = rsg0.a0(new z0r0(Collections.singletonList(userId), strArr, str)).K().l(new u5(new bhh(userId, 11), 10));
        } else {
            ComFeatures comFeatures = ComFeatures.COM_GROUPS_GETBYID_CODEGEN;
            comFeatures.getClass();
            if (com.vk.toggle.b.A.a(comFeatures)) {
                List singletonList = Collections.singletonList(fkq0.a(userId));
                List l2 = e43.l(GroupsFieldsDto.SCREEN_NAME, GroupsFieldsDto.PHOTO_BASE);
                if ((4 & 2) != 0) {
                    l2 = null;
                }
                fz2 y = yfb.y(xqu.a.a(null, singletonList, l2), new xr0(25));
                ahn.D(y);
                K = rsg0.a0(y).K();
            } else {
                K = rsg0.a0(new rpu(fkq0.e(userId), strArr)).K();
            }
            l = K.l(new ed(new lrk(userId, 6), 14));
        }
        return new io.reactivex.rxjava3.internal.operators.single.r(l, new ux0(new y90(11), 14));
    }
}
