package com.yandex.passport.internal.util;

import android.content.Context;
import com.adjust.sdk.Constants;
import com.pdfview.subsamplincscaleimageview.SubsamplingScaleImageView;
import com.yandex.messaging.core.net.entities.UpdateOrganizationResult;
import com.yandex.passport.internal.ui.sloth.webauthn.RegisterWebAuthNActivity;
import com.yandex.passport.internal.ui.social.gimap.ImapServerPrefsFragment;
import com.ybsdk.rconfig.configs.QrScannerGuidelinesConfigSchema;
import defpackage.gtq0;
import java.util.Map;
import kotlin.Pair;
import ru.CryptoPro.JCSP.MSCAPI.HProv;
import ru.CryptoPro.JCSP.MSCAPI.MSException;
import ru.CryptoPro.ssl.cl_88;
import ru.yandex.video.m3.data.exception.network.NetworkRequestException;
import ru.yandex.video.m3.ott.data.net.impl.ConcurrencyArbiterApiImpl;
import ru.yandex.video.m3.player.ui.debug.internal.providers.SessionColorProviderImpl;
import ru.yandex.video.m3.preload_manager.PreloadManagerBuilder;

/* loaded from: classes15.dex */
public abstract class n {
    public static final Map a;

    static {
        Pair S = gtq0.S(202, 30);
        Pair S2 = gtq0.S(204, 31);
        Pair S3 = gtq0.S(206, 32);
        Pair S4 = gtq0.S(208, 33);
        Pair S5 = gtq0.S(212, 377);
        Pair S6 = gtq0.S(213, 376);
        Pair S7 = gtq0.S(214, 34);
        Pair S8 = gtq0.S(216, 36);
        Integer valueOf = Integer.valueOf(HProv.PP_AUTH_INFO);
        a = kotlin.collections.b.i(S, S2, S3, S4, S5, S6, S7, S8, gtq0.S(valueOf, 387), gtq0.S(219, 385), gtq0.S(220, 381), gtq0.S(222, 39), gtq0.S(226, 40), gtq0.S(228, 41), gtq0.S(230, 420), gtq0.S(231, 421), gtq0.S(232, 43), gtq0.S(Integer.valueOf(MSException.ERROR_MORE_DATA), 44), gtq0.S(235, 44), gtq0.S(238, 45), gtq0.S(Integer.valueOf(PreloadManagerBuilder.MAXIMUM_TRACK_PRELOAD_TIMEOUT_IN_SEC), 46), gtq0.S(242, 47), gtq0.S(244, 358), gtq0.S(246, 370), gtq0.S(247, 371), gtq0.S(248, 372), gtq0.S(250, 7), gtq0.S(255, 380), gtq0.S(257, 375), gtq0.S(Integer.valueOf(MSException.ERROR_NO_MORE_ITEMS), 373), gtq0.S(260, 48), gtq0.S(262, 49), gtq0.S(266, 350), gtq0.S(268, 351), gtq0.S(Integer.valueOf(SubsamplingScaleImageView.ORIENTATION_270), 352), gtq0.S(272, 353), gtq0.S(274, 354), gtq0.S(276, 355), gtq0.S(278, 356), gtq0.S(280, 357), gtq0.S(282, 995), gtq0.S(283, 374), gtq0.S(284, 359), gtq0.S(286, 90), gtq0.S(288, 298), gtq0.S(289, 7), gtq0.S(290, 299), gtq0.S(292, 378), gtq0.S(293, 386), gtq0.S(294, 389), gtq0.S(295, 423), gtq0.S(297, 382), gtq0.S(302, 1), gtq0.S(308, 508), gtq0.S(310, 1), gtq0.S(311, 1), gtq0.S(312, 1), gtq0.S(316, 1), gtq0.S(330, 1), gtq0.S(334, 52), gtq0.S(338, 1876), gtq0.S(340, 590), gtq0.S(340, 594), gtq0.S(340, 596), gtq0.S(342, 1246), gtq0.S(344, 1268), gtq0.S(346, 1345), gtq0.S(348, 284), gtq0.S(350, 1441), gtq0.S(352, 1473), gtq0.S(354, 1664), gtq0.S(356, 1869), gtq0.S(358, 1758), gtq0.S(360, 1784), gtq0.S(362, 599), gtq0.S(363, 297), gtq0.S(364, 1242), gtq0.S(365, 1264), gtq0.S(366, 1767), gtq0.S(368, 53), gtq0.S(370, 1809), gtq0.S(372, 509), gtq0.S(374, 1868), gtq0.S(376, 1340), gtq0.S(Integer.valueOf(Constants.MINIMAL_ERROR_STATUS_CODE), 994), gtq0.S(401, 7), gtq0.S(402, 975), gtq0.S(404, 91), gtq0.S(405, 91), gtq0.S(410, 92), gtq0.S(412, 93), gtq0.S(413, 94), gtq0.S(414, 95), gtq0.S(415, 961), gtq0.S(Integer.valueOf(NetworkRequestException.INVALID_RANGE), 962), gtq0.S(417, 963), gtq0.S(Integer.valueOf(ConcurrencyArbiterApiImpl.RESPONSE_CODE_418), 964), gtq0.S(419, 965), gtq0.S(420, 966), gtq0.S(421, 967), gtq0.S(Integer.valueOf(UpdateOrganizationResult.BaseError.UNPROCESSABLE_ENTITY), 968), gtq0.S(424, 971), gtq0.S(425, 970), gtq0.S(425, 972), gtq0.S(426, 973), gtq0.S(427, 974), gtq0.S(428, 976), gtq0.S(Integer.valueOf(NetworkRequestException.TOO_MANY_REQUESTS), 977), gtq0.S(430, 971), gtq0.S(431, 971), gtq0.S(432, 98), gtq0.S(434, 998), gtq0.S(436, 992), gtq0.S(437, 996), gtq0.S(438, Integer.valueOf(ImapServerPrefsFragment.DEFAULT_IMAP_PORT)), gtq0.S(440, 81), gtq0.S(441, 81), gtq0.S(Integer.valueOf(SessionColorProviderImpl.SHORT_SESSION_MAX_STALLED_LENGTH_MS_YELLOW_BOUND), 82), gtq0.S(452, 84), gtq0.S(Integer.valueOf(NetworkRequestException.BANNED), 852), gtq0.S(455, 853), gtq0.S(456, 855), gtq0.S(457, 856), gtq0.S(460, 86), gtq0.S(466, 886), gtq0.S(467, 850), gtq0.S(470, 880), gtq0.S(472, 960), gtq0.S(502, 60), gtq0.S(505, 61), gtq0.S(510, 62), gtq0.S(514, 670), gtq0.S(515, 63), gtq0.S(520, 66), gtq0.S(525, 65), gtq0.S(528, 673), gtq0.S(530, 64), gtq0.S(537, 675), gtq0.S(Integer.valueOf(cl_88.s), 676), gtq0.S(540, 677), gtq0.S(541, 678), gtq0.S(542, 679), gtq0.S(544, 684), gtq0.S(545, 686), gtq0.S(546, 687), gtq0.S(547, 689), gtq0.S(548, 682), gtq0.S(549, 685), gtq0.S(550, 691), gtq0.S(552, Integer.valueOf(QrScannerGuidelinesConfigSchema.MIN_SCREEN_HEIGHT_TO_SHOW_GUIDELINES)), gtq0.S(553, 688), gtq0.S(555, 683), gtq0.S(602, 20), gtq0.S(603, 213), gtq0.S(604, 212), gtq0.S(605, 216), gtq0.S(606, valueOf), gtq0.S(607, 220), gtq0.S(608, 221), gtq0.S(609, 222), gtq0.S(610, 223), gtq0.S(611, 224), gtq0.S(612, 225), gtq0.S(613, 226), gtq0.S(614, 227), gtq0.S(615, 228), gtq0.S(616, 229), gtq0.S(617, 230), gtq0.S(618, 231), gtq0.S(619, 232), gtq0.S(620, 233), gtq0.S(621, Integer.valueOf(MSException.ERROR_MORE_DATA)), gtq0.S(622, 235), gtq0.S(623, 236), gtq0.S(624, 237), gtq0.S(625, 238), gtq0.S(626, 239), gtq0.S(627, Integer.valueOf(PreloadManagerBuilder.MAXIMUM_TRACK_PRELOAD_TIMEOUT_IN_SEC)), gtq0.S(628, 241), gtq0.S(629, 242), gtq0.S(630, 243), gtq0.S(631, 244), gtq0.S(632, 245), gtq0.S(633, 248), gtq0.S(634, 249), gtq0.S(635, 250), gtq0.S(636, 251), gtq0.S(637, 252), gtq0.S(638, 253), gtq0.S(639, 254), gtq0.S(640, 255), gtq0.S(641, 256), gtq0.S(642, 257), gtq0.S(643, 258), gtq0.S(645, 260), gtq0.S(646, Integer.valueOf(cl_88.n)), gtq0.S(647, 262), gtq0.S(648, 263), gtq0.S(649, 264), gtq0.S(650, 265), gtq0.S(651, 266), gtq0.S(652, 267), gtq0.S(653, 268), gtq0.S(654, 269), gtq0.S(655, 27), gtq0.S(657, 291), gtq0.S(659, 211), gtq0.S(702, Integer.valueOf(RegisterWebAuthNActivity.RESULT_ACCOUNT_NOT_FOUND)), gtq0.S(704, 502), gtq0.S(706, 503), gtq0.S(708, 504), gtq0.S(710, 505), gtq0.S(712, 506), gtq0.S(714, 507), gtq0.S(716, 51), gtq0.S(722, 54), gtq0.S(724, 55), gtq0.S(730, 56), gtq0.S(732, 57), gtq0.S(734, 58), gtq0.S(736, 591), gtq0.S(738, 592), gtq0.S(740, 593), gtq0.S(744, 595), gtq0.S(746, 597), gtq0.S(748, 598), gtq0.S(750, 500), gtq0.S(901, 870));
    }

    public static final String a(Context context) {
        Integer num = (Integer) a.get(Integer.valueOf(context.getResources().getConfiguration().mcc));
        if (num == null) {
            return null;
        }
        return "+" + num;
    }
}
