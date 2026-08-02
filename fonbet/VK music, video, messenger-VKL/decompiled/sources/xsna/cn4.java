package xsna;

import android.content.Context;
import com.vk.dto.clips.morphing.AudioEffectType;
import com.vkontakte.android.R;
import kotlin.NoWhenBranchMatchedException;
import xsna.ixd;

/* compiled from: AudioEffectItem.kt */
/* loaded from: classes16.dex */
public final class cn4 extends zif0 {
    public final AudioEffectType a;
    public boolean b;
    public final String c;
    public final int d;

    /* compiled from: AudioEffectItem.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[AudioEffectType.values().length];
            try {
                iArr[AudioEffectType.DEFAULT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AudioEffectType.HALL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[AudioEffectType.ECHO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[AudioEffectType.CATHEDRAL.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[AudioEffectType.ROBOT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[AudioEffectType.GIANT.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[AudioEffectType.SQUIRREL.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[AudioEffectType.BALLOON.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[AudioEffectType.EVIL.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public cn4(AudioEffectType audioEffectType, Context context) {
        this.a = audioEffectType;
        switch (a.$EnumSwitchMapping$0[audioEffectType.ordinal()]) {
            case 1:
                ixd ixdVar = ad0.g;
                ixd.b bVar = (ixdVar != null ? ixdVar : null).a;
                this.d = R.drawable.vk_icon_block_outline_24;
                this.c = "";
                return;
            case 2:
                ixd ixdVar2 = ad0.g;
                ixd.b bVar2 = (ixdVar2 != null ? ixdVar2 : null).a;
                this.d = R.drawable.vk_icon_vk_clips_illustration_zal_24;
                this.c = wlb0.s(R.string.clip_editor_morphing_effect_zal, context);
                return;
            case 3:
                ixd ixdVar3 = ad0.g;
                ixd.b bVar3 = (ixdVar3 != null ? ixdVar3 : null).a;
                this.d = R.drawable.vk_icon_vk_clips_illustration_echo_24;
                this.c = wlb0.s(R.string.clip_editor_morphing_effect_echo, context);
                return;
            case 4:
                ixd ixdVar4 = ad0.g;
                ixd.b bVar4 = (ixdVar4 != null ? ixdVar4 : null).a;
                this.d = R.drawable.vk_icon_vk_clips_illustration_cathedral_24;
                this.c = wlb0.s(R.string.clip_editor_morphing_effect_cathedral, context);
                return;
            case 5:
                ixd ixdVar5 = ad0.g;
                ixd.b bVar5 = (ixdVar5 != null ? ixdVar5 : null).a;
                this.d = R.drawable.vk_icon_vk_clips_illustration_robot_24;
                this.c = wlb0.s(R.string.clip_editor_morphing_effect_robot, context);
                return;
            case 6:
                ixd ixdVar6 = ad0.g;
                ixd.b bVar6 = (ixdVar6 != null ? ixdVar6 : null).a;
                this.d = R.drawable.vk_icon_vk_clips_illustration_gigant_24;
                this.c = wlb0.s(R.string.clip_editor_morphing_effect_gigant, context);
                return;
            case 7:
                ixd ixdVar7 = ad0.g;
                ixd.b bVar7 = (ixdVar7 != null ? ixdVar7 : null).a;
                this.d = R.drawable.vk_icon_vk_clips_illustration_squirel_24;
                this.c = wlb0.s(R.string.clip_editor_morphing_effect_squirel, context);
                return;
            case 8:
                ixd ixdVar8 = ad0.g;
                ixd.b bVar8 = (ixdVar8 != null ? ixdVar8 : null).a;
                this.d = R.drawable.vk_icon_vk_clips_illustration_baloon_24;
                this.c = wlb0.s(R.string.clip_editor_morphing_effect_baloon, context);
                return;
            case 9:
                ixd ixdVar9 = ad0.g;
                ixd.b bVar9 = (ixdVar9 != null ? ixdVar9 : null).a;
                this.d = R.drawable.vk_icon_vk_clips_illustration_angry_24;
                this.c = wlb0.s(R.string.clip_editor_morphing_effect_angry, context);
                return;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    @Override // xsna.zif0
    public final int b() {
        return R.layout.item_clips_morphing_effect_holder;
    }
}
