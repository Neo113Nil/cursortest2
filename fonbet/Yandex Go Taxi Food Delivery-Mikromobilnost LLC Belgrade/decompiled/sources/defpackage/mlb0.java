package defpackage;

import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.yandex.mapkit.annotations.SpeakerPhraseToken;
import com.yandex.messaging.domain.poll.PollMessageDraft;
import com.ybsdk.widgets.common.BlendingGradientView;
import com.ybsdk.widgets.common.rangedatepicker.CalendarDayView;
import io.appmetrica.analytics.BuildConfig;
import ru.CryptoPro.JCSP.MSCAPI.HProv;
import ru.CryptoPro.JCSP.MSCAPI.MSException;
import ru.cprocsp.NGate.tools.Constants;

/* loaded from: classes11.dex */
public final class mlb0 {
    public static String a(SpeakerPhraseToken speakerPhraseToken) {
        switch (llb0.a[speakerPhraseToken.ordinal()]) {
            case 1:
                return "Meter";
            case 2:
                return "Meters";
            case 3:
                return "Meters2_4";
            case 4:
                return "Kilometer";
            case 5:
                return "Kilometers";
            case 6:
                return "Kilometers2_4";
            case 7:
                return "Then";
            case 8:
                return "And";
            case 9:
                return "Forward";
            case 10:
                return "Over";
            case 11:
                return "Exit";
            case 12:
                return "Ahead";
            case 13:
                return "RouteFinished";
            case 14:
                return "RouteWillFinish";
            case 15:
                return "LandmarkAfterBridge";
            case 16:
                return "LandmarkAfterTunnel";
            case 17:
                return "LandmarkAtTrafficLights";
            case 18:
                return "LandmarkBeforeBridge";
            case 19:
                return "LandmarkBeforeTrafficLights";
            case 20:
                return "LandmarkBeforeTunnel";
            case 21:
                return "LandmarkIntoCourtyard";
            case 22:
                return "LandmarkIntoTunnel";
            case 23:
                return "LandmarkToBridge";
            case 24:
                return "LandmarkToFrontageRoad";
            case 25:
                return "HardTurnLeft";
            case 26:
                return "HardTurnRight";
            case 27:
                return "TakeLeft";
            case 28:
                return "TakeRight";
            case 29:
                return "TurnLeft";
            case 30:
                return "TurnRight";
            case 31:
                return "TurnBack";
            case 32:
                return "BoardFerry";
            case 33:
                return "InCircularMovement";
            case 34:
                return "RouteRecalculated";
            case 35:
                return "RouteLost";
            case 36:
                return "RouteReturn";
            case 37:
                return "SpeedLimitExceeded";
            case 38:
                return "RouteViaPoint";
            case 39:
                return "FasterRouteAvailable";
            case 40:
                return "Accident";
            case 41:
                return "Reconstruction";
            case 42:
                return "LaneCamera";
            case 43:
            case 44:
                return "SpeedCamera";
            case 45:
                return "SpeedLimitCamera";
            case 46:
                return "AtMiddle";
            case 47:
                return "AtLeft";
            case 48:
                return "AtRight";
            case 49:
                return "AndMiddle";
            case 50:
                return "AndRight";
            case SAFETY_TIPS_VALUE:
                return "Row";
            case 52:
                return "Speed30";
            case 53:
                return "Speed40";
            case 54:
                return "Speed50";
            case SODA_DE_DE_VALUE:
                return "Speed60";
            case 56:
                return "Speed70";
            case SODA_ES_ES_VALUE:
                return "Speed80";
            case 58:
                return "Speed90";
            case 59:
                return "Speed100";
            case 60:
                return "Speed110";
            case 61:
                return "Speed120";
            case 62:
                return "Speed130";
            case THIRD_PARTY_COOKIE_DEPRECATION_METADATA_VALUE:
                return "1";
            case 64:
                return "2";
            case 65:
                return "3";
            case 66:
                return "4";
            case 67:
                return "5";
            case TRANSLATE_KIT_VALUE:
                return "6";
            case 69:
                return "7";
            case 70:
                return "8";
            case 71:
                return "9";
            case 72:
                return "10";
            case HProv.ALG_SID_GR3410_12_256 /* 73 */:
                return "11";
            case 74:
                return "12";
            case HProv.PROV_GOST_2001_DH /* 75 */:
                return "13";
            case CalendarDayView.DISABLED_DAY_ALPHA /* 76 */:
                return "14";
            case HProv.ALG_SID_SHA3_224 /* 77 */:
                return "15";
            case HProv.ALG_SID_SHA3_256 /* 78 */:
                return "16";
            case HProv.ALG_SID_SHA3_384 /* 79 */:
                return "17";
            case 80:
                return "18";
            case 81:
                return "19";
            case 82:
                return "20";
            case 83:
                return "30";
            case HProv.ALG_SID_NO_HASH /* 84 */:
                return "40";
            case 85:
                return "50";
            case MSException.ERROR_INVALID_PASSWORD /* 86 */:
                return "60";
            case MSException.ERROR_INVALID_PARAMETER /* 87 */:
                return "70";
            case HProv.ALG_SID_KECCAK_224 /* 88 */:
                return "80";
            case HProv.ALG_SID_KECCAK_256 /* 89 */:
                return "90";
            case 90:
                return "100";
            case 91:
                return "100_exactly";
            case HProv.PP_HASHOID /* 92 */:
                return "200";
            case HProv.PP_CIPHEROID /* 93 */:
                return "300";
            case HProv.PP_SIGNATUREOID /* 94 */:
                return "400";
            case HProv.PP_DHOID /* 95 */:
                return "500";
            case HProv.PP_RESERVED1 /* 96 */:
                return "600";
            case HProv.PP_BIO_STATISTICA_LEN /* 97 */:
                return "700";
            case HProv.PP_REBOOT /* 98 */:
                return "800";
            case 99:
                return "900";
            case 100:
                return "1st";
            case 101:
                return "2nd";
            case 102:
                return "3rd";
            case 103:
                return "4th";
            case 104:
                return "5th";
            case 105:
                return "6th";
            case 106:
                return "7th";
            case HProv.PP_SET_PIN /* 107 */:
                return "8th";
            case 108:
                return "9th";
            case 109:
                return "10th";
            case 110:
                return "11th";
            case 111:
                return "12th";
            case 112:
                return "Attention";
            case 113:
                return "TollRoadAhead";
            case 114:
                return "RouteUpdatedToTollRoad";
            case HProv.PP_CACHE_SIZE /* 115 */:
                return "And_1_FR";
            case BuildConfig.API_LEVEL /* 116 */:
                return "ExitTurnFem_FR";
            case HProv.PP_NK_SYNC /* 117 */:
                return "ExitTurnMasc_FR";
            case HProv.PP_INFO /* 118 */:
                return "GetLeft_FR";
            case 119:
                return "GetRight_FR";
            case 120:
                return "Danger";
            case Constants.VPN_TRAFFIC /* 121 */:
                return "InCircularMovement_DANS_FR";
            case 122:
                return "Rows";
            case HProv.PP_PASSWD_TERM /* 123 */:
                return "DoExit";
            case HProv.PP_SAME_MEDIA /* 124 */:
                return "SchoolAhead";
            case HProv.PP_DELETE_KEYSET /* 125 */:
                return "RoadMarkingCamera";
            case HProv.PP_DELETE_SAVED_PASSWD /* 126 */:
                return "CrossRoadCamera";
            case HProv.PP_VERSION_TIMESTAMP /* 127 */:
                return "ForbiddenStopCamera";
            case 128:
                return "MobileCamera";
            case HProv.PP_SECURITY_LEVEL /* 129 */:
                return "OvertakingDanger";
            case 130:
                return "PedestriansAhead";
            case HProv.PP_FAST_CODE /* 131 */:
                return "DangerCrossroadAhead";
            case HProv.PP_CONTAINER_EXTENSION /* 132 */:
                return "WalkStraight";
            case HProv.PP_ENUM_CONTAINER_EXTENSION /* 133 */:
                return "PedestrianRouteFinished";
            case HProv.PP_CONTAINER_EXTENSION_DEL /* 134 */:
                return "PedestrianWaypointPassed";
            case HProv.PP_CONTAINER_DEFAULT /* 135 */:
                return "Crosswalk";
            case HProv.PP_LCD_QUERY /* 136 */:
                return "IntoUnderpass";
            case HProv.PP_ENUM_LOG /* 137 */:
                return "OutOfUnderpass";
            case HProv.PP_VERSION_EX /* 138 */:
                return "IntoOverpass";
            case 139:
                return "OutOfOverpass";
            case PollMessageDraft.MAX_ANSWER_LENGTH /* 140 */:
                return "Stairs";
            case 141:
                return "StairsUp";
            case 142:
                return "StairsDown";
            case 143:
                return "Dismount";
            case 144:
                return "OntoPedestrianRoad";
            case 145:
                return "OntoBicycleRoad";
            case HProv.PP_CONTAINER_STATUS /* 146 */:
                return "OntoAutoRoad";
            case 147:
                return "TakeLeftLane";
            case 148:
                return "TakeMiddleLane";
            case 149:
                return "TakeRightLane";
            case 150:
                return "TakeSecondLeftLane";
            case 151:
                return "TakeSecondRightLane";
            case 152:
                return "TakeThirdLeftLane";
            case BlendingGradientView.BASE_ALPHA /* 153 */:
                return "TakeThirdRightLane";
            case 154:
                return "TakeLeftLanes";
            case ModuleDescriptor.MODULE_VERSION /* 155 */:
                return "TakeMiddleLanes";
            case 156:
                return "TakeRightLanes";
            case 157:
                return "EsTwentyOne";
            case HProv.PP_LICENSE /* 158 */:
                return "EsTwentyTwo";
            case 159:
                return "EsTwentyThree";
            case 160:
                return "EsTwentyFour";
            case 161:
                return "EsTwentyFive";
            case 162:
                return "EsTwentySix";
            case HProv.PP_HANDLE_COUNT /* 163 */:
                return "EsTwentySeven";
            case 164:
                return "EsTwentyEight";
            case 165:
                return "EsTwentyNine";
            default:
                return null;
        }
    }
}
