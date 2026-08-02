package xsna;

import com.vk.im.reactions.impl.models.AnimationID;
import com.vkontakte.android.R;
import java.util.HashMap;
import java.util.List;
import kotlin.Pair;

/* compiled from: DefaultReactionAssets.kt */
/* loaded from: classes2.dex */
public final class jll {
    public static final List<Integer> a = e43.l(1, 2, 3, 4, 5, 6, 7, 8);
    public static final HashMap<Integer, yaw> b;
    public static final HashMap<Integer, Integer> c;

    static {
        AnimationID animationID = AnimationID.HEART;
        Pair pair = new Pair(Integer.valueOf(animationID.h()), new yaw(animationID.h(), R.raw.msg_reaction_svg_heart, R.string.im_msg_reaction_heart_content_description, R.color.vk_red, Integer.valueOf(R.raw.msg_reaction_ani_heart), Integer.valueOf(R.raw.msg_reaction_ani_heart_big), 448));
        AnimationID animationID2 = AnimationID.FIRE;
        Pair pair2 = new Pair(Integer.valueOf(animationID2.h()), new yaw(animationID2.h(), R.raw.msg_reaction_svg_fire, R.string.im_msg_reaction_fire_content_description, R.color.vk_orange_fire, Integer.valueOf(R.raw.msg_reaction_ani_fire), Integer.valueOf(R.raw.msg_reaction_ani_fire_big), 448));
        AnimationID animationID3 = AnimationID.LOL;
        Pair pair3 = new Pair(Integer.valueOf(animationID3.h()), new yaw(animationID3.h(), R.raw.msg_reaction_svg_lol, R.string.im_msg_reaction_laugh_till_cry_content_description, R.color.vk_orange, Integer.valueOf(R.raw.msg_reaction_ani_lol), Integer.valueOf(R.raw.msg_reaction_ani_lol_big), 448));
        AnimationID animationID4 = AnimationID.LIKE;
        Pair pair4 = new Pair(Integer.valueOf(animationID4.h()), new yaw(animationID4.h(), R.raw.msg_reaction_svg_like, R.string.im_msg_reaction_like_content_description, R.color.vk_yellow, Integer.valueOf(R.raw.msg_reaction_ani_like), Integer.valueOf(R.raw.msg_reaction_ani_like_big), 448));
        AnimationID animationID5 = AnimationID.POOP;
        Pair pair5 = new Pair(Integer.valueOf(animationID5.h()), new yaw(animationID5.h(), R.raw.msg_reaction_svg_poop, R.string.im_msg_reaction_shit_content_description, R.color.vk_red_dark, Integer.valueOf(R.raw.msg_reaction_ani_poop), Integer.valueOf(R.raw.msg_reaction_ani_poop_big), 448));
        AnimationID animationID6 = AnimationID.QUESTION;
        Pair pair6 = new Pair(Integer.valueOf(animationID6.h()), new yaw(animationID6.h(), R.raw.msg_reaction_svg_question, R.string.im_msg_reaction_questions_content_description, R.color.vk_violet, Integer.valueOf(R.raw.msg_reaction_ani_question), Integer.valueOf(R.raw.msg_reaction_ani_question_big), 448));
        AnimationID animationID7 = AnimationID.CRY;
        Pair pair7 = new Pair(Integer.valueOf(animationID7.h()), new yaw(animationID7.h(), R.raw.msg_reaction_svg_cry, R.string.im_msg_reaction_cry_content_description, R.color.vk_blue_200, Integer.valueOf(R.raw.msg_reaction_ani_cry), Integer.valueOf(R.raw.msg_reaction_ani_cry_big), 448));
        AnimationID animationID8 = AnimationID.ANGRY;
        b = pn00.i(pair, pair2, pair3, pair4, pair5, pair6, pair7, new Pair(Integer.valueOf(animationID8.h()), new yaw(animationID8.h(), R.raw.msg_reaction_svg_angry, R.string.im_msg_reaction_angry_content_description, R.color.vk_pink, Integer.valueOf(R.raw.msg_reaction_ani_angry), Integer.valueOf(R.raw.msg_reaction_ani_angry_big), 448)));
        c = pn00.i(new Pair(1, Integer.valueOf(R.string.im_msg_reaction_heart_content_description)), new Pair(2, Integer.valueOf(R.string.im_msg_reaction_fire_content_description)), new Pair(3, Integer.valueOf(R.string.im_msg_reaction_laugh_till_cry_content_description)), new Pair(4, Integer.valueOf(R.string.im_msg_reaction_like_content_description)), new Pair(5, Integer.valueOf(R.string.im_msg_reaction_shit_content_description)), new Pair(6, Integer.valueOf(R.string.im_msg_reaction_questions_content_description)), new Pair(7, Integer.valueOf(R.string.im_msg_reaction_cry_content_description)), new Pair(8, Integer.valueOf(R.string.im_msg_reaction_angry_content_description)), new Pair(9, Integer.valueOf(R.string.im_msg_reaction_9_content_description)), new Pair(10, Integer.valueOf(R.string.im_msg_reaction_10_content_description)), new Pair(11, Integer.valueOf(R.string.im_msg_reaction_11_content_description)), new Pair(12, Integer.valueOf(R.string.im_msg_reaction_12_content_description)), new Pair(13, Integer.valueOf(R.string.im_msg_reaction_13_content_description)), new Pair(14, Integer.valueOf(R.string.im_msg_reaction_14_content_description)), new Pair(15, Integer.valueOf(R.string.im_msg_reaction_15_content_description)), new Pair(16, Integer.valueOf(R.string.im_msg_reaction_16_content_description)), new Pair(17, Integer.valueOf(R.string.im_msg_reaction_17_content_description)), new Pair(18, Integer.valueOf(R.string.im_msg_reaction_18_content_description)), new Pair(19, Integer.valueOf(R.string.im_msg_reaction_19_content_description)), new Pair(20, Integer.valueOf(R.string.im_msg_reaction_20_content_description)), new Pair(21, Integer.valueOf(R.string.im_msg_reaction_21_content_description)), new Pair(22, Integer.valueOf(R.string.im_msg_reaction_22_content_description)), new Pair(23, Integer.valueOf(R.string.im_msg_reaction_23_content_description)), new Pair(24, Integer.valueOf(R.string.im_msg_reaction_24_content_description)), new Pair(25, Integer.valueOf(R.string.im_msg_reaction_25_content_description)), new Pair(26, Integer.valueOf(R.string.im_msg_reaction_26_content_description)), new Pair(27, Integer.valueOf(R.string.im_msg_reaction_27_content_description)), new Pair(28, Integer.valueOf(R.string.im_msg_reaction_28_content_description)), new Pair(29, Integer.valueOf(R.string.im_msg_reaction_29_content_description)), new Pair(30, Integer.valueOf(R.string.im_msg_reaction_30_content_description)), new Pair(31, Integer.valueOf(R.string.im_msg_reaction_31_content_description)), new Pair(32, Integer.valueOf(R.string.im_msg_reaction_32_content_description)), new Pair(33, Integer.valueOf(R.string.im_msg_reaction_33_content_description)), new Pair(34, Integer.valueOf(R.string.im_msg_reaction_34_content_description)), new Pair(35, Integer.valueOf(R.string.im_msg_reaction_35_content_description)), new Pair(36, Integer.valueOf(R.string.im_msg_reaction_36_content_description)), new Pair(37, Integer.valueOf(R.string.im_msg_reaction_37_content_description)), new Pair(38, Integer.valueOf(R.string.im_msg_reaction_38_content_description)), new Pair(39, Integer.valueOf(R.string.im_msg_reaction_39_content_description)), new Pair(40, Integer.valueOf(R.string.im_msg_reaction_40_content_description)), new Pair(41, Integer.valueOf(R.string.im_msg_reaction_41_content_description)), new Pair(42, Integer.valueOf(R.string.im_msg_reaction_42_content_description)), new Pair(64, Integer.valueOf(R.string.im_msg_reaction_64_content_description)));
    }
}
