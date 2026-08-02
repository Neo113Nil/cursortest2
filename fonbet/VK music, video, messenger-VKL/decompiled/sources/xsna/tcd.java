package xsna;

import android.content.Context;
import com.vk.attachpicker.stickers.reply.ReplyVideoStickerStyle;
import com.vk.core.utils.VerifyInfoHelper;
import com.vk.dto.common.ClipVideoFile;
import com.vk.dto.common.clips.CoOwnerItem;
import com.vk.dto.common.id.UserId;
import com.vkontakte.android.R;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import xsna.grt0;
import xsna.q4g0;

/* compiled from: ClipStickerFactoryImpl.kt */
/* loaded from: classes6.dex */
public final class tcd implements scd {
    public final b25 a;

    public tcd(b25 b25Var) {
        this.a = b25Var;
    }

    @Override // xsna.scd
    public final nov a(Context context, ClipVideoFile clipVideoFile, String str, String str2, Float f) {
        String T7 = str2 == null ? clipVideoFile.f.T7() : str2;
        String str3 = str2 == null ? T7 : null;
        boolean z = str2 != null;
        int i = clipVideoFile.m0;
        int i2 = clipVideoFile.n0;
        grt0.a aVar = new grt0.a(i, i2, z, clipVideoFile.Q0, T7, str3, clipVideoFile.e * 1000);
        List l = i >= i2 ? e43.l(ReplyVideoStickerStyle.PREVIEW, ReplyVideoStickerStyle.MINIATURE) : ReplyVideoStickerStyle.h();
        UserId userId = clipVideoFile.b;
        int i3 = clipVideoFile.c;
        String str4 = clipVideoFile.m;
        List<CoOwnerItem> list = clipVideoFile.N1;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((CoOwnerItem) obj).Ab()) {
                arrayList.add(obj);
            }
        }
        q4g0.b.a aVar2 = new q4g0.b.a(i3, userId, str4, arrayList);
        String str5 = clipVideoFile.p0;
        if (str5 == null) {
            str5 = "";
        }
        q4g0 q4g0Var = new q4g0(aVar2, str5, VerifyInfoHelper.h(VerifyInfoHelper.a, clipVideoFile.o0, context, VerifyInfoHelper.ColorTheme.white, 24), R.string.sticker_type_prefix_clip, new q4g0.a(ReplyVideoStickerStyle.PREVIEW, l), true, this.a.i().U);
        p4g0 p4g0Var = new p4g0(context, aVar, f != null ? f.floatValue() : clipVideoFile.E0(), str, str2 != null ? new mat0(new File(str2), false, 0L, clipVideoFile.e * 1000, false, null, 496) : null, 12);
        p4g0Var.setHasMusic(false);
        return new r4g0(context, q4g0Var, p4g0Var, false);
    }
}
