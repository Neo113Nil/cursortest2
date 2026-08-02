package xsna;

import android.content.Context;
import com.vk.attachpicker.stickers.photo.PhotoStickerStyle;
import com.vk.core.utils.VerifyInfoHelper;
import com.vkontakte.android.R;
import java.util.Collections;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import xsna.kba0;
import xsna.mba0;

/* compiled from: PhotoStickerViewStateMapper.kt */
/* loaded from: classes15.dex */
public final class nba0 {

    /* compiled from: PhotoStickerViewStateMapper.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[PhotoStickerStyle.values().length];
            try {
                iArr[PhotoStickerStyle.PREVIEW.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PhotoStickerStyle.FULLSCREEN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static mba0 a(Context context, kba0 kba0Var) {
        boolean z;
        boolean z2;
        int i;
        boolean z3 = kba0Var.e;
        kba0.a aVar = kba0Var.c;
        bpn0 bpn0Var = o25.a;
        if (bpn0Var == null) {
            bpn0Var = null;
        }
        String str = ((b25) bpn0Var.getValue()).o().b;
        PhotoStickerStyle photoStickerStyle = aVar.a;
        int i2 = z3 ? R.string.sticker_type_prefix_story : R.string.sticker_type_prefix_photo_gen;
        if (photoStickerStyle == PhotoStickerStyle.FULLSCREEN) {
            z2 = false;
            z = true;
        } else {
            z = false;
            z2 = false;
        }
        float f = kba0Var.b;
        if (photoStickerStyle == PhotoStickerStyle.PREVIEW) {
            z2 = true;
        }
        String str2 = kba0Var.d;
        String str3 = kba0Var.g;
        if (str3 == null) {
            str3 = kba0Var.a;
        }
        List singletonList = Collections.singletonList(new u75(VerifyInfoHelper.h(VerifyInfoHelper.a, fco0.j(kba0Var.j), context, VerifyInfoHelper.ColorTheme.white, 24), str3));
        int i3 = z3 ? R.string.accessibility_story : R.string.accessibility_photo;
        int i4 = a.$EnumSwitchMapping$0[aVar.a.ordinal()];
        if (i4 == 1) {
            i = R.string.repost_style_preview;
        } else {
            if (i4 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            i = R.string.repost_style_fullscreen;
        }
        return new mba0(z, f, i2, str, z2, str2, singletonList, new mba0.a(i3, i));
    }
}
