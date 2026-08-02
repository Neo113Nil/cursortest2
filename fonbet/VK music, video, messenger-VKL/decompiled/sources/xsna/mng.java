package xsna;

import android.content.Context;
import android.os.Bundle;
import com.vk.dto.common.id.UserId;
import com.vk.dto.stickers.VmojiAvatar;
import com.vk.stickers.ContextUser;
import com.vk.superapp.miniapps.api.utils.InternalVkMiniApps;
import com.vk.vmoji.character.VmojiCharacterFragment;
import com.vk.vmoji.upload.VmojiPhotoUploadFragment;
import com.vungle.ads.internal.protos.Sdk;

/* compiled from: CommonVmojiBridge.kt */
/* loaded from: classes7.dex */
public final class mng implements d6w0 {
    public static final mng a = new mng();

    @Override // xsna.d6w0
    public final void b(Context context, String str, String str2) {
        hf3.d(new np20((int) InternalVkMiniApps.VK_VMOJI_PROD.h().a, context, null, new iq20(null, str, null, null, null, null, null, null, 253), new aq20(null, null, null, null, null, null, str2, false, null, false, 3967), 4));
    }

    @Override // xsna.d6w0
    public final void c(Context context, VmojiAvatar vmojiAvatar) {
        VmojiCharacterFragment.b bVar = new VmojiCharacterFragment.b(VmojiCharacterFragment.class, null, null);
        bVar.j.putParcelable("arg_avatar", vmojiAvatar);
        context.startActivity(bVar.n(context));
    }

    @Override // xsna.d6w0
    public final void d(Context context, int i, String str) {
        zal0.H(g2v.d().a(), context, i, null, str != null ? new ContextUser(str) : null, null, null, 116);
    }

    @Override // xsna.d6w0
    public final void e(jbs jbsVar, String str) {
        VmojiPhotoUploadFragment.a aVar = new VmojiPhotoUploadFragment.a(VmojiPhotoUploadFragment.class, null, null);
        aVar.j.putString("extra_filename", str);
        aVar.i(jbsVar, Sdk.SDKError.Reason.TPAT_ERROR_VALUE);
    }

    @Override // xsna.d6w0
    public final void f(long j, Context context, Integer num, String str) {
        UserId userId = new UserId(j);
        VmojiCharacterFragment.a aVar = new VmojiCharacterFragment.a(VmojiCharacterFragment.class, null, null);
        Bundle bundle = aVar.j;
        bundle.putParcelable("arg_user_id", userId);
        bundle.putString("arg_character_id", str);
        if (num != null) {
            bundle.putInt("arg_pack_id", num.intValue());
        }
        context.startActivity(aVar.n(context));
    }
}
