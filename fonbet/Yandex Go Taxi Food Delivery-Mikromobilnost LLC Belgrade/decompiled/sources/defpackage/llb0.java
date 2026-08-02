package defpackage;

import com.yandex.mapkit.annotations.SpeakerPhraseToken;

/* loaded from: classes15.dex */
public abstract /* synthetic */ class llb0 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[SpeakerPhraseToken.values().length];
        try {
            iArr[SpeakerPhraseToken.METER.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[SpeakerPhraseToken.METERS.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[SpeakerPhraseToken.METERS_2_4.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[SpeakerPhraseToken.KILOMETER.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[SpeakerPhraseToken.KILOMETERS.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[SpeakerPhraseToken.KILOMETERS_2_4.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr[SpeakerPhraseToken.THEN.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr[SpeakerPhraseToken.AND.ordinal()] = 8;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr[SpeakerPhraseToken.STRAIGHT.ordinal()] = 9;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            iArr[SpeakerPhraseToken.OVER.ordinal()] = 10;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            iArr[SpeakerPhraseToken.EXIT.ordinal()] = 11;
        } catch (NoSuchFieldError unused11) {
        }
        try {
            iArr[SpeakerPhraseToken.AHEAD.ordinal()] = 12;
        } catch (NoSuchFieldError unused12) {
        }
        try {
            iArr[SpeakerPhraseToken.ROUTE_FINISHED.ordinal()] = 13;
        } catch (NoSuchFieldError unused13) {
        }
        try {
            iArr[SpeakerPhraseToken.ROUTE_WILL_FINISH.ordinal()] = 14;
        } catch (NoSuchFieldError unused14) {
        }
        try {
            iArr[SpeakerPhraseToken.AFTER_BRIDGE.ordinal()] = 15;
        } catch (NoSuchFieldError unused15) {
        }
        try {
            iArr[SpeakerPhraseToken.AFTER_TUNNEL.ordinal()] = 16;
        } catch (NoSuchFieldError unused16) {
        }
        try {
            iArr[SpeakerPhraseToken.AT_TRAFFIC_LIGHTS.ordinal()] = 17;
        } catch (NoSuchFieldError unused17) {
        }
        try {
            iArr[SpeakerPhraseToken.BEFORE_BRIDGE.ordinal()] = 18;
        } catch (NoSuchFieldError unused18) {
        }
        try {
            iArr[SpeakerPhraseToken.BEFORE_TRAFFIC_LIGHTS.ordinal()] = 19;
        } catch (NoSuchFieldError unused19) {
        }
        try {
            iArr[SpeakerPhraseToken.BEFORE_TUNNEL.ordinal()] = 20;
        } catch (NoSuchFieldError unused20) {
        }
        try {
            iArr[SpeakerPhraseToken.INTO_COURTYARD.ordinal()] = 21;
        } catch (NoSuchFieldError unused21) {
        }
        try {
            iArr[SpeakerPhraseToken.INTO_TUNNEL.ordinal()] = 22;
        } catch (NoSuchFieldError unused22) {
        }
        try {
            iArr[SpeakerPhraseToken.TO_BRIDGE.ordinal()] = 23;
        } catch (NoSuchFieldError unused23) {
        }
        try {
            iArr[SpeakerPhraseToken.TO_FRONTAGE_ROAD.ordinal()] = 24;
        } catch (NoSuchFieldError unused24) {
        }
        try {
            iArr[SpeakerPhraseToken.HARD_TURN_LEFT.ordinal()] = 25;
        } catch (NoSuchFieldError unused25) {
        }
        try {
            iArr[SpeakerPhraseToken.HARD_TURN_RIGHT.ordinal()] = 26;
        } catch (NoSuchFieldError unused26) {
        }
        try {
            iArr[SpeakerPhraseToken.TAKE_LEFT.ordinal()] = 27;
        } catch (NoSuchFieldError unused27) {
        }
        try {
            iArr[SpeakerPhraseToken.TAKE_RIGHT.ordinal()] = 28;
        } catch (NoSuchFieldError unused28) {
        }
        try {
            iArr[SpeakerPhraseToken.TURN_LEFT.ordinal()] = 29;
        } catch (NoSuchFieldError unused29) {
        }
        try {
            iArr[SpeakerPhraseToken.TURN_RIGHT.ordinal()] = 30;
        } catch (NoSuchFieldError unused30) {
        }
        try {
            iArr[SpeakerPhraseToken.TURN_BACK.ordinal()] = 31;
        } catch (NoSuchFieldError unused31) {
        }
        try {
            iArr[SpeakerPhraseToken.BOARD_FERRY.ordinal()] = 32;
        } catch (NoSuchFieldError unused32) {
        }
        try {
            iArr[SpeakerPhraseToken.ENTER_ROUNDABOUT.ordinal()] = 33;
        } catch (NoSuchFieldError unused33) {
        }
        try {
            iArr[SpeakerPhraseToken.ROUTE_UPDATED.ordinal()] = 34;
        } catch (NoSuchFieldError unused34) {
        }
        try {
            iArr[SpeakerPhraseToken.GONE_OFF_ROUTE.ordinal()] = 35;
        } catch (NoSuchFieldError unused35) {
        }
        try {
            iArr[SpeakerPhraseToken.RETURNED_ON_ROUTE.ordinal()] = 36;
        } catch (NoSuchFieldError unused36) {
        }
        try {
            iArr[SpeakerPhraseToken.SPEED_LIMIT_EXCEEDED.ordinal()] = 37;
        } catch (NoSuchFieldError unused37) {
        }
        try {
            iArr[SpeakerPhraseToken.WAY_POINT_PASSED.ordinal()] = 38;
        } catch (NoSuchFieldError unused38) {
        }
        try {
            iArr[SpeakerPhraseToken.FASTER_ROUTE_AVAILABLE.ordinal()] = 39;
        } catch (NoSuchFieldError unused39) {
        }
        try {
            iArr[SpeakerPhraseToken.ACCIDENT.ordinal()] = 40;
        } catch (NoSuchFieldError unused40) {
        }
        try {
            iArr[SpeakerPhraseToken.RECONSTRUCTION.ordinal()] = 41;
        } catch (NoSuchFieldError unused41) {
        }
        try {
            iArr[SpeakerPhraseToken.LANE_CAMERA.ordinal()] = 42;
        } catch (NoSuchFieldError unused42) {
        }
        try {
            iArr[SpeakerPhraseToken.SPEED_CAMERA.ordinal()] = 43;
        } catch (NoSuchFieldError unused43) {
        }
        try {
            iArr[SpeakerPhraseToken.CAMERA.ordinal()] = 44;
        } catch (NoSuchFieldError unused44) {
        }
        try {
            iArr[SpeakerPhraseToken.SPEED_LIMIT_CAMERA.ordinal()] = 45;
        } catch (NoSuchFieldError unused45) {
        }
        try {
            iArr[SpeakerPhraseToken.AT_MIDDLE.ordinal()] = 46;
        } catch (NoSuchFieldError unused46) {
        }
        try {
            iArr[SpeakerPhraseToken.AT_LEFT.ordinal()] = 47;
        } catch (NoSuchFieldError unused47) {
        }
        try {
            iArr[SpeakerPhraseToken.AT_RIGHT.ordinal()] = 48;
        } catch (NoSuchFieldError unused48) {
        }
        try {
            iArr[SpeakerPhraseToken.AND_MIDDLE.ordinal()] = 49;
        } catch (NoSuchFieldError unused49) {
        }
        try {
            iArr[SpeakerPhraseToken.AND_RIGHT.ordinal()] = 50;
        } catch (NoSuchFieldError unused50) {
        }
        try {
            iArr[SpeakerPhraseToken.LANE_LOCATIVE.ordinal()] = 51;
        } catch (NoSuchFieldError unused51) {
        }
        try {
            iArr[SpeakerPhraseToken.SPEED30.ordinal()] = 52;
        } catch (NoSuchFieldError unused52) {
        }
        try {
            iArr[SpeakerPhraseToken.SPEED40.ordinal()] = 53;
        } catch (NoSuchFieldError unused53) {
        }
        try {
            iArr[SpeakerPhraseToken.SPEED50.ordinal()] = 54;
        } catch (NoSuchFieldError unused54) {
        }
        try {
            iArr[SpeakerPhraseToken.SPEED60.ordinal()] = 55;
        } catch (NoSuchFieldError unused55) {
        }
        try {
            iArr[SpeakerPhraseToken.SPEED70.ordinal()] = 56;
        } catch (NoSuchFieldError unused56) {
        }
        try {
            iArr[SpeakerPhraseToken.SPEED80.ordinal()] = 57;
        } catch (NoSuchFieldError unused57) {
        }
        try {
            iArr[SpeakerPhraseToken.SPEED90.ordinal()] = 58;
        } catch (NoSuchFieldError unused58) {
        }
        try {
            iArr[SpeakerPhraseToken.SPEED100.ordinal()] = 59;
        } catch (NoSuchFieldError unused59) {
        }
        try {
            iArr[SpeakerPhraseToken.SPEED110.ordinal()] = 60;
        } catch (NoSuchFieldError unused60) {
        }
        try {
            iArr[SpeakerPhraseToken.SPEED120.ordinal()] = 61;
        } catch (NoSuchFieldError unused61) {
        }
        try {
            iArr[SpeakerPhraseToken.SPEED130.ordinal()] = 62;
        } catch (NoSuchFieldError unused62) {
        }
        try {
            iArr[SpeakerPhraseToken.ONE.ordinal()] = 63;
        } catch (NoSuchFieldError unused63) {
        }
        try {
            iArr[SpeakerPhraseToken.TWO.ordinal()] = 64;
        } catch (NoSuchFieldError unused64) {
        }
        try {
            iArr[SpeakerPhraseToken.THREE.ordinal()] = 65;
        } catch (NoSuchFieldError unused65) {
        }
        try {
            iArr[SpeakerPhraseToken.FOUR.ordinal()] = 66;
        } catch (NoSuchFieldError unused66) {
        }
        try {
            iArr[SpeakerPhraseToken.FIVE.ordinal()] = 67;
        } catch (NoSuchFieldError unused67) {
        }
        try {
            iArr[SpeakerPhraseToken.SIX.ordinal()] = 68;
        } catch (NoSuchFieldError unused68) {
        }
        try {
            iArr[SpeakerPhraseToken.SEVEN.ordinal()] = 69;
        } catch (NoSuchFieldError unused69) {
        }
        try {
            iArr[SpeakerPhraseToken.EIGHT.ordinal()] = 70;
        } catch (NoSuchFieldError unused70) {
        }
        try {
            iArr[SpeakerPhraseToken.NINE.ordinal()] = 71;
        } catch (NoSuchFieldError unused71) {
        }
        try {
            iArr[SpeakerPhraseToken.TEN.ordinal()] = 72;
        } catch (NoSuchFieldError unused72) {
        }
        try {
            iArr[SpeakerPhraseToken.ELEVEN.ordinal()] = 73;
        } catch (NoSuchFieldError unused73) {
        }
        try {
            iArr[SpeakerPhraseToken.TWELVE.ordinal()] = 74;
        } catch (NoSuchFieldError unused74) {
        }
        try {
            iArr[SpeakerPhraseToken.THIRTEEN.ordinal()] = 75;
        } catch (NoSuchFieldError unused75) {
        }
        try {
            iArr[SpeakerPhraseToken.FOURTEEN.ordinal()] = 76;
        } catch (NoSuchFieldError unused76) {
        }
        try {
            iArr[SpeakerPhraseToken.FIFTEEN.ordinal()] = 77;
        } catch (NoSuchFieldError unused77) {
        }
        try {
            iArr[SpeakerPhraseToken.SIXTEEN.ordinal()] = 78;
        } catch (NoSuchFieldError unused78) {
        }
        try {
            iArr[SpeakerPhraseToken.SEVENTEEN.ordinal()] = 79;
        } catch (NoSuchFieldError unused79) {
        }
        try {
            iArr[SpeakerPhraseToken.EIGHTEEN.ordinal()] = 80;
        } catch (NoSuchFieldError unused80) {
        }
        try {
            iArr[SpeakerPhraseToken.NINETEEN.ordinal()] = 81;
        } catch (NoSuchFieldError unused81) {
        }
        try {
            iArr[SpeakerPhraseToken.TWENTY.ordinal()] = 82;
        } catch (NoSuchFieldError unused82) {
        }
        try {
            iArr[SpeakerPhraseToken.THIRTY.ordinal()] = 83;
        } catch (NoSuchFieldError unused83) {
        }
        try {
            iArr[SpeakerPhraseToken.FORTY.ordinal()] = 84;
        } catch (NoSuchFieldError unused84) {
        }
        try {
            iArr[SpeakerPhraseToken.FIFTY.ordinal()] = 85;
        } catch (NoSuchFieldError unused85) {
        }
        try {
            iArr[SpeakerPhraseToken.SIXTY.ordinal()] = 86;
        } catch (NoSuchFieldError unused86) {
        }
        try {
            iArr[SpeakerPhraseToken.SEVENTY.ordinal()] = 87;
        } catch (NoSuchFieldError unused87) {
        }
        try {
            iArr[SpeakerPhraseToken.EIGHTY.ordinal()] = 88;
        } catch (NoSuchFieldError unused88) {
        }
        try {
            iArr[SpeakerPhraseToken.NINETY.ordinal()] = 89;
        } catch (NoSuchFieldError unused89) {
        }
        try {
            iArr[SpeakerPhraseToken.ONE_HUNDRED.ordinal()] = 90;
        } catch (NoSuchFieldError unused90) {
        }
        try {
            iArr[SpeakerPhraseToken.ONE_HUNDRED_EXACTLY.ordinal()] = 91;
        } catch (NoSuchFieldError unused91) {
        }
        try {
            iArr[SpeakerPhraseToken.TWO_HUNDRED.ordinal()] = 92;
        } catch (NoSuchFieldError unused92) {
        }
        try {
            iArr[SpeakerPhraseToken.THREE_HUNDRED.ordinal()] = 93;
        } catch (NoSuchFieldError unused93) {
        }
        try {
            iArr[SpeakerPhraseToken.FOUR_HUNDRED.ordinal()] = 94;
        } catch (NoSuchFieldError unused94) {
        }
        try {
            iArr[SpeakerPhraseToken.FIVE_HUNDRED.ordinal()] = 95;
        } catch (NoSuchFieldError unused95) {
        }
        try {
            iArr[SpeakerPhraseToken.SIX_HUNDRED.ordinal()] = 96;
        } catch (NoSuchFieldError unused96) {
        }
        try {
            iArr[SpeakerPhraseToken.SEVEN_HUNDRED.ordinal()] = 97;
        } catch (NoSuchFieldError unused97) {
        }
        try {
            iArr[SpeakerPhraseToken.EIGHT_HUNDRED.ordinal()] = 98;
        } catch (NoSuchFieldError unused98) {
        }
        try {
            iArr[SpeakerPhraseToken.NINE_HUNDRED.ordinal()] = 99;
        } catch (NoSuchFieldError unused99) {
        }
        try {
            iArr[SpeakerPhraseToken.FIRST.ordinal()] = 100;
        } catch (NoSuchFieldError unused100) {
        }
        try {
            iArr[SpeakerPhraseToken.SECOND.ordinal()] = 101;
        } catch (NoSuchFieldError unused101) {
        }
        try {
            iArr[SpeakerPhraseToken.THIRD.ordinal()] = 102;
        } catch (NoSuchFieldError unused102) {
        }
        try {
            iArr[SpeakerPhraseToken.FOURTH.ordinal()] = 103;
        } catch (NoSuchFieldError unused103) {
        }
        try {
            iArr[SpeakerPhraseToken.FIFTH.ordinal()] = 104;
        } catch (NoSuchFieldError unused104) {
        }
        try {
            iArr[SpeakerPhraseToken.SIXTH.ordinal()] = 105;
        } catch (NoSuchFieldError unused105) {
        }
        try {
            iArr[SpeakerPhraseToken.SEVENTH.ordinal()] = 106;
        } catch (NoSuchFieldError unused106) {
        }
        try {
            iArr[SpeakerPhraseToken.EIGHTH.ordinal()] = 107;
        } catch (NoSuchFieldError unused107) {
        }
        try {
            iArr[SpeakerPhraseToken.NINTH.ordinal()] = 108;
        } catch (NoSuchFieldError unused108) {
        }
        try {
            iArr[SpeakerPhraseToken.TENTH.ordinal()] = 109;
        } catch (NoSuchFieldError unused109) {
        }
        try {
            iArr[SpeakerPhraseToken.ELEVENTH.ordinal()] = 110;
        } catch (NoSuchFieldError unused110) {
        }
        try {
            iArr[SpeakerPhraseToken.TWELFTH.ordinal()] = 111;
        } catch (NoSuchFieldError unused111) {
        }
        try {
            iArr[SpeakerPhraseToken.ATTENTION.ordinal()] = 112;
        } catch (NoSuchFieldError unused112) {
        }
        try {
            iArr[SpeakerPhraseToken.TOLL_ROAD_AHEAD.ordinal()] = 113;
        } catch (NoSuchFieldError unused113) {
        }
        try {
            iArr[SpeakerPhraseToken.ROUTE_UPDATED_TO_TOLL_ROAD.ordinal()] = 114;
        } catch (NoSuchFieldError unused114) {
        }
        try {
            iArr[SpeakerPhraseToken.AND_ONE.ordinal()] = 115;
        } catch (NoSuchFieldError unused115) {
        }
        try {
            iArr[SpeakerPhraseToken.EXIT_TURN__FEM.ordinal()] = 116;
        } catch (NoSuchFieldError unused116) {
        }
        try {
            iArr[SpeakerPhraseToken.EXIT_TURN__MASC.ordinal()] = 117;
        } catch (NoSuchFieldError unused117) {
        }
        try {
            iArr[SpeakerPhraseToken.GET_LEFT.ordinal()] = 118;
        } catch (NoSuchFieldError unused118) {
        }
        try {
            iArr[SpeakerPhraseToken.GET_RIGHT.ordinal()] = 119;
        } catch (NoSuchFieldError unused119) {
        }
        try {
            iArr[SpeakerPhraseToken.DANGER.ordinal()] = 120;
        } catch (NoSuchFieldError unused120) {
        }
        try {
            iArr[SpeakerPhraseToken.ROUNDABOUT.ordinal()] = 121;
        } catch (NoSuchFieldError unused121) {
        }
        try {
            iArr[SpeakerPhraseToken.LANES_LOCATIVE.ordinal()] = 122;
        } catch (NoSuchFieldError unused122) {
        }
        try {
            iArr[SpeakerPhraseToken.DO_EXIT.ordinal()] = 123;
        } catch (NoSuchFieldError unused123) {
        }
        try {
            iArr[SpeakerPhraseToken.SCHOOL_AHEAD.ordinal()] = 124;
        } catch (NoSuchFieldError unused124) {
        }
        try {
            iArr[SpeakerPhraseToken.ROAD_MARKING_CAMERA.ordinal()] = 125;
        } catch (NoSuchFieldError unused125) {
        }
        try {
            iArr[SpeakerPhraseToken.CROSS_ROAD_CAMERA.ordinal()] = 126;
        } catch (NoSuchFieldError unused126) {
        }
        try {
            iArr[SpeakerPhraseToken.FORBIDDEN_STOP_CAMERA.ordinal()] = 127;
        } catch (NoSuchFieldError unused127) {
        }
        try {
            iArr[SpeakerPhraseToken.MOBILE_CAMERA.ordinal()] = 128;
        } catch (NoSuchFieldError unused128) {
        }
        try {
            iArr[SpeakerPhraseToken.OVERTAKING_DANGER.ordinal()] = 129;
        } catch (NoSuchFieldError unused129) {
        }
        try {
            iArr[SpeakerPhraseToken.PEDESTRIAN_DANGER.ordinal()] = 130;
        } catch (NoSuchFieldError unused130) {
        }
        try {
            iArr[SpeakerPhraseToken.CROSSROAD_DANGER.ordinal()] = 131;
        } catch (NoSuchFieldError unused131) {
        }
        try {
            iArr[SpeakerPhraseToken.WALK_STRAIGHT.ordinal()] = 132;
        } catch (NoSuchFieldError unused132) {
        }
        try {
            iArr[SpeakerPhraseToken.PEDESTRIAN_ROUTE_FINISHED.ordinal()] = 133;
        } catch (NoSuchFieldError unused133) {
        }
        try {
            iArr[SpeakerPhraseToken.PEDESTRIAN_WAYPOINT_PASSED.ordinal()] = 134;
        } catch (NoSuchFieldError unused134) {
        }
        try {
            iArr[SpeakerPhraseToken.CROSSWALK.ordinal()] = 135;
        } catch (NoSuchFieldError unused135) {
        }
        try {
            iArr[SpeakerPhraseToken.INTO_UNDERPASS.ordinal()] = 136;
        } catch (NoSuchFieldError unused136) {
        }
        try {
            iArr[SpeakerPhraseToken.OUT_OF_UNDERPASS.ordinal()] = 137;
        } catch (NoSuchFieldError unused137) {
        }
        try {
            iArr[SpeakerPhraseToken.INTO_OVERPASS.ordinal()] = 138;
        } catch (NoSuchFieldError unused138) {
        }
        try {
            iArr[SpeakerPhraseToken.OUT_OF_OVERPASS.ordinal()] = 139;
        } catch (NoSuchFieldError unused139) {
        }
        try {
            iArr[SpeakerPhraseToken.STAIRS.ordinal()] = 140;
        } catch (NoSuchFieldError unused140) {
        }
        try {
            iArr[SpeakerPhraseToken.STAIRS_UP.ordinal()] = 141;
        } catch (NoSuchFieldError unused141) {
        }
        try {
            iArr[SpeakerPhraseToken.STAIRS_DOWN.ordinal()] = 142;
        } catch (NoSuchFieldError unused142) {
        }
        try {
            iArr[SpeakerPhraseToken.DISMOUNT.ordinal()] = 143;
        } catch (NoSuchFieldError unused143) {
        }
        try {
            iArr[SpeakerPhraseToken.ONTO_PEDESTRIAN_ROAD.ordinal()] = 144;
        } catch (NoSuchFieldError unused144) {
        }
        try {
            iArr[SpeakerPhraseToken.ONTO_BICYCLE_ROAD.ordinal()] = 145;
        } catch (NoSuchFieldError unused145) {
        }
        try {
            iArr[SpeakerPhraseToken.ONTO_AUTO_ROAD.ordinal()] = 146;
        } catch (NoSuchFieldError unused146) {
        }
        try {
            iArr[SpeakerPhraseToken.TAKE_LEFT_LANE.ordinal()] = 147;
        } catch (NoSuchFieldError unused147) {
        }
        try {
            iArr[SpeakerPhraseToken.TAKE_MIDDLE_LANE.ordinal()] = 148;
        } catch (NoSuchFieldError unused148) {
        }
        try {
            iArr[SpeakerPhraseToken.TAKE_RIGHT_LANE.ordinal()] = 149;
        } catch (NoSuchFieldError unused149) {
        }
        try {
            iArr[SpeakerPhraseToken.TAKE_SECOND_LEFT_LANE.ordinal()] = 150;
        } catch (NoSuchFieldError unused150) {
        }
        try {
            iArr[SpeakerPhraseToken.TAKE_SECOND_RIGHT_LANE.ordinal()] = 151;
        } catch (NoSuchFieldError unused151) {
        }
        try {
            iArr[SpeakerPhraseToken.TAKE_THIRD_LEFT_LANE.ordinal()] = 152;
        } catch (NoSuchFieldError unused152) {
        }
        try {
            iArr[SpeakerPhraseToken.TAKE_THIRD_RIGHT_LANE.ordinal()] = 153;
        } catch (NoSuchFieldError unused153) {
        }
        try {
            iArr[SpeakerPhraseToken.TAKE_LEFT_LANES.ordinal()] = 154;
        } catch (NoSuchFieldError unused154) {
        }
        try {
            iArr[SpeakerPhraseToken.TAKE_MIDDLE_LANES.ordinal()] = 155;
        } catch (NoSuchFieldError unused155) {
        }
        try {
            iArr[SpeakerPhraseToken.TAKE_RIGHT_LANES.ordinal()] = 156;
        } catch (NoSuchFieldError unused156) {
        }
        try {
            iArr[SpeakerPhraseToken.ES_TWENTY_ONE.ordinal()] = 157;
        } catch (NoSuchFieldError unused157) {
        }
        try {
            iArr[SpeakerPhraseToken.ES_TWENTY_TWO.ordinal()] = 158;
        } catch (NoSuchFieldError unused158) {
        }
        try {
            iArr[SpeakerPhraseToken.ES_TWENTY_THREE.ordinal()] = 159;
        } catch (NoSuchFieldError unused159) {
        }
        try {
            iArr[SpeakerPhraseToken.ES_TWENTY_FOUR.ordinal()] = 160;
        } catch (NoSuchFieldError unused160) {
        }
        try {
            iArr[SpeakerPhraseToken.ES_TWENTY_FIVE.ordinal()] = 161;
        } catch (NoSuchFieldError unused161) {
        }
        try {
            iArr[SpeakerPhraseToken.ES_TWENTY_SIX.ordinal()] = 162;
        } catch (NoSuchFieldError unused162) {
        }
        try {
            iArr[SpeakerPhraseToken.ES_TWENTY_SEVEN.ordinal()] = 163;
        } catch (NoSuchFieldError unused163) {
        }
        try {
            iArr[SpeakerPhraseToken.ES_TWENTY_EIGHT.ordinal()] = 164;
        } catch (NoSuchFieldError unused164) {
        }
        try {
            iArr[SpeakerPhraseToken.ES_TWENTY_NINE.ordinal()] = 165;
        } catch (NoSuchFieldError unused165) {
        }
        try {
            iArr[SpeakerPhraseToken.AR_ONE_GENITIVE.ordinal()] = 166;
        } catch (NoSuchFieldError unused166) {
        }
        try {
            iArr[SpeakerPhraseToken.AR_TWO_GENITIVE.ordinal()] = 167;
        } catch (NoSuchFieldError unused167) {
        }
        try {
            iArr[SpeakerPhraseToken.AR_THREE_GENITIVE.ordinal()] = 168;
        } catch (NoSuchFieldError unused168) {
        }
        try {
            iArr[SpeakerPhraseToken.AR_FOUR_GENITIVE.ordinal()] = 169;
        } catch (NoSuchFieldError unused169) {
        }
        try {
            iArr[SpeakerPhraseToken.AR_FIVE_GENITIVE.ordinal()] = 170;
        } catch (NoSuchFieldError unused170) {
        }
        try {
            iArr[SpeakerPhraseToken.AR_SIX_GENITIVE.ordinal()] = 171;
        } catch (NoSuchFieldError unused171) {
        }
        try {
            iArr[SpeakerPhraseToken.AR_SEVEN_GENITIVE.ordinal()] = 172;
        } catch (NoSuchFieldError unused172) {
        }
        try {
            iArr[SpeakerPhraseToken.AR_EIGHT_GENITIVE.ordinal()] = 173;
        } catch (NoSuchFieldError unused173) {
        }
        try {
            iArr[SpeakerPhraseToken.AR_NINE_GENITIVE.ordinal()] = 174;
        } catch (NoSuchFieldError unused174) {
        }
        try {
            iArr[SpeakerPhraseToken.AR_TEN_GENITIVE.ordinal()] = 175;
        } catch (NoSuchFieldError unused175) {
        }
        try {
            iArr[SpeakerPhraseToken.AR_ELEVEN_GENITIVE.ordinal()] = 176;
        } catch (NoSuchFieldError unused176) {
        }
        try {
            iArr[SpeakerPhraseToken.AR_TWELVE_GENITIVE.ordinal()] = 177;
        } catch (NoSuchFieldError unused177) {
        }
        try {
            iArr[SpeakerPhraseToken.AR_THIRTEEN_GENITIVE.ordinal()] = 178;
        } catch (NoSuchFieldError unused178) {
        }
        try {
            iArr[SpeakerPhraseToken.AR_FOURTEEN_GENITIVE.ordinal()] = 179;
        } catch (NoSuchFieldError unused179) {
        }
        try {
            iArr[SpeakerPhraseToken.AR_FIFTEEN_GENITIVE.ordinal()] = 180;
        } catch (NoSuchFieldError unused180) {
        }
        try {
            iArr[SpeakerPhraseToken.AR_SIXTEEN_GENITIVE.ordinal()] = 181;
        } catch (NoSuchFieldError unused181) {
        }
        try {
            iArr[SpeakerPhraseToken.AR_SEVENTEEN_GENITIVE.ordinal()] = 182;
        } catch (NoSuchFieldError unused182) {
        }
        try {
            iArr[SpeakerPhraseToken.AR_EIGHTEEN_GENITIVE.ordinal()] = 183;
        } catch (NoSuchFieldError unused183) {
        }
        try {
            iArr[SpeakerPhraseToken.AR_NINETEEN_GENITIVE.ordinal()] = 184;
        } catch (NoSuchFieldError unused184) {
        }
        try {
            iArr[SpeakerPhraseToken.AR_TWENTY_GENITIVE.ordinal()] = 185;
        } catch (NoSuchFieldError unused185) {
        }
        try {
            iArr[SpeakerPhraseToken.AR_THIRTY_GENITIVE.ordinal()] = 186;
        } catch (NoSuchFieldError unused186) {
        }
        try {
            iArr[SpeakerPhraseToken.AR_FORTY_GENITIVE.ordinal()] = 187;
        } catch (NoSuchFieldError unused187) {
        }
        try {
            iArr[SpeakerPhraseToken.AR_FIFTY_GENITIVE.ordinal()] = 188;
        } catch (NoSuchFieldError unused188) {
        }
        try {
            iArr[SpeakerPhraseToken.AR_SIXTY_GENITIVE.ordinal()] = 189;
        } catch (NoSuchFieldError unused189) {
        }
        try {
            iArr[SpeakerPhraseToken.AR_SEVENTY_GENITIVE.ordinal()] = 190;
        } catch (NoSuchFieldError unused190) {
        }
        try {
            iArr[SpeakerPhraseToken.AR_EIGHTY_GENITIVE.ordinal()] = 191;
        } catch (NoSuchFieldError unused191) {
        }
        try {
            iArr[SpeakerPhraseToken.AR_NINETY_GENITIVE.ordinal()] = 192;
        } catch (NoSuchFieldError unused192) {
        }
        try {
            iArr[SpeakerPhraseToken.AR_ONE_HUNDRED_GENITIVE.ordinal()] = 193;
        } catch (NoSuchFieldError unused193) {
        }
        try {
            iArr[SpeakerPhraseToken.AR_TWO_HUNDRED_GENITIVE.ordinal()] = 194;
        } catch (NoSuchFieldError unused194) {
        }
        try {
            iArr[SpeakerPhraseToken.AR_THREE_HUNDRED_GENITIVE.ordinal()] = 195;
        } catch (NoSuchFieldError unused195) {
        }
        try {
            iArr[SpeakerPhraseToken.AR_FOUR_HUNDRED_GENITIVE.ordinal()] = 196;
        } catch (NoSuchFieldError unused196) {
        }
        try {
            iArr[SpeakerPhraseToken.AR_FIVE_HUNDRED_GENITIVE.ordinal()] = 197;
        } catch (NoSuchFieldError unused197) {
        }
        try {
            iArr[SpeakerPhraseToken.AR_SIX_HUNDRED_GENITIVE.ordinal()] = 198;
        } catch (NoSuchFieldError unused198) {
        }
        try {
            iArr[SpeakerPhraseToken.AR_SEVEN_HUNDRED_GENITIVE.ordinal()] = 199;
        } catch (NoSuchFieldError unused199) {
        }
        try {
            iArr[SpeakerPhraseToken.AR_EIGHT_HUNDRED_GENITIVE.ordinal()] = 200;
        } catch (NoSuchFieldError unused200) {
        }
        try {
            iArr[SpeakerPhraseToken.AR_NINE_HUNDRED_GENITIVE.ordinal()] = 201;
        } catch (NoSuchFieldError unused201) {
        }
        try {
            iArr[SpeakerPhraseToken.AR_KILOMETER_SINGULAR_NOMINATIVE.ordinal()] = 202;
        } catch (NoSuchFieldError unused202) {
        }
        try {
            iArr[SpeakerPhraseToken.AR_KILOMETER_SINGULAR_GENITIVE.ordinal()] = 203;
        } catch (NoSuchFieldError unused203) {
        }
        try {
            iArr[SpeakerPhraseToken.AR_KILOMETER_SINGULAR_ACCUSATIVE.ordinal()] = 204;
        } catch (NoSuchFieldError unused204) {
        }
        try {
            iArr[SpeakerPhraseToken.AR_KILOMETER_DUAL_NOMINATIVE.ordinal()] = 205;
        } catch (NoSuchFieldError unused205) {
        }
        try {
            iArr[SpeakerPhraseToken.AR_KILOMETER_DUAL_GENITIVE.ordinal()] = 206;
        } catch (NoSuchFieldError unused206) {
        }
        try {
            iArr[SpeakerPhraseToken.AR_KILOMETER_PLURAL_GENITIVE.ordinal()] = 207;
        } catch (NoSuchFieldError unused207) {
        }
        try {
            iArr[SpeakerPhraseToken.AR_METER_SINGULAR_NOMINATIVE.ordinal()] = 208;
        } catch (NoSuchFieldError unused208) {
        }
        try {
            iArr[SpeakerPhraseToken.AR_METER_SINGULAR_GENITIVE.ordinal()] = 209;
        } catch (NoSuchFieldError unused209) {
        }
        try {
            iArr[SpeakerPhraseToken.AR_METER_SINGULAR_ACCUSATIVE.ordinal()] = 210;
        } catch (NoSuchFieldError unused210) {
        }
        try {
            iArr[SpeakerPhraseToken.AR_METER_DUAL_NOMINATIVE.ordinal()] = 211;
        } catch (NoSuchFieldError unused211) {
        }
        try {
            iArr[SpeakerPhraseToken.AR_METER_DUAL_GENITIVE.ordinal()] = 212;
        } catch (NoSuchFieldError unused212) {
        }
        try {
            iArr[SpeakerPhraseToken.AR_METER_PLURAL_GENITIVE.ordinal()] = 213;
        } catch (NoSuchFieldError unused213) {
        }
        try {
            iArr[SpeakerPhraseToken.HY_TWENTY_TWO.ordinal()] = 214;
        } catch (NoSuchFieldError unused214) {
        }
        try {
            iArr[SpeakerPhraseToken.HY_TWENTY_THREE.ordinal()] = 215;
        } catch (NoSuchFieldError unused215) {
        }
        try {
            iArr[SpeakerPhraseToken.HY_THIRTY_TWO.ordinal()] = 216;
        } catch (NoSuchFieldError unused216) {
        }
        try {
            iArr[SpeakerPhraseToken.HY_THIRTY_THREE.ordinal()] = 217;
        } catch (NoSuchFieldError unused217) {
        }
        try {
            iArr[SpeakerPhraseToken.HY_FORTY_TWO.ordinal()] = 218;
        } catch (NoSuchFieldError unused218) {
        }
        try {
            iArr[SpeakerPhraseToken.HY_FORTY_THREE.ordinal()] = 219;
        } catch (NoSuchFieldError unused219) {
        }
        try {
            iArr[SpeakerPhraseToken.HY_FIFTY_TWO.ordinal()] = 220;
        } catch (NoSuchFieldError unused220) {
        }
        try {
            iArr[SpeakerPhraseToken.HY_FIFTY_THREE.ordinal()] = 221;
        } catch (NoSuchFieldError unused221) {
        }
        try {
            iArr[SpeakerPhraseToken.HY_SIXTY_TWO.ordinal()] = 222;
        } catch (NoSuchFieldError unused222) {
        }
        try {
            iArr[SpeakerPhraseToken.HY_SIXTY_THREE.ordinal()] = 223;
        } catch (NoSuchFieldError unused223) {
        }
        try {
            iArr[SpeakerPhraseToken.HY_SEVENTY_TWO.ordinal()] = 224;
        } catch (NoSuchFieldError unused224) {
        }
        try {
            iArr[SpeakerPhraseToken.HY_SEVENTY_THREE.ordinal()] = 225;
        } catch (NoSuchFieldError unused225) {
        }
        try {
            iArr[SpeakerPhraseToken.HY_EIGHTY_TWO.ordinal()] = 226;
        } catch (NoSuchFieldError unused226) {
        }
        try {
            iArr[SpeakerPhraseToken.HY_EIGHTY_THREE.ordinal()] = 227;
        } catch (NoSuchFieldError unused227) {
        }
        try {
            iArr[SpeakerPhraseToken.HY_NINETY_TWO.ordinal()] = 228;
        } catch (NoSuchFieldError unused228) {
        }
        try {
            iArr[SpeakerPhraseToken.HY_NINETY_THREE.ordinal()] = 229;
        } catch (NoSuchFieldError unused229) {
        }
        try {
            iArr[SpeakerPhraseToken.PARKING_ROUTE_AVAILABLE.ordinal()] = 230;
        } catch (NoSuchFieldError unused230) {
        }
        try {
            iArr[SpeakerPhraseToken.SPEED_BUMP_AHEAD.ordinal()] = 231;
        } catch (NoSuchFieldError unused231) {
        }
        try {
            iArr[SpeakerPhraseToken.SEVERAL_SPEED_BUMPS_AHEAD.ordinal()] = 232;
        } catch (NoSuchFieldError unused232) {
        }
        try {
            iArr[SpeakerPhraseToken.RAILWAY_CROSSING_AHEAD.ordinal()] = 233;
        } catch (NoSuchFieldError unused233) {
        }
        try {
            iArr[SpeakerPhraseToken.GET_OFF_AT_THE_STOP.ordinal()] = 234;
        } catch (NoSuchFieldError unused234) {
        }
        try {
            iArr[SpeakerPhraseToken.YOUR_STOP_IS_COMING_SOON.ordinal()] = 235;
        } catch (NoSuchFieldError unused235) {
        }
        try {
            iArr[SpeakerPhraseToken.TRAVEL_TO_THE_STOP.ordinal()] = 236;
        } catch (NoSuchFieldError unused236) {
        }
        try {
            iArr[SpeakerPhraseToken.TAKE_THE_BUS.ordinal()] = 237;
        } catch (NoSuchFieldError unused237) {
        }
        try {
            iArr[SpeakerPhraseToken.TAKE_THE_MINIBUS.ordinal()] = 238;
        } catch (NoSuchFieldError unused238) {
        }
        try {
            iArr[SpeakerPhraseToken.TAKE_THE_RAILWAY.ordinal()] = 239;
        } catch (NoSuchFieldError unused239) {
        }
        try {
            iArr[SpeakerPhraseToken.TAKE_THE_SUBURBAN.ordinal()] = 240;
        } catch (NoSuchFieldError unused240) {
        }
        try {
            iArr[SpeakerPhraseToken.TAKE_THE_TRAM.ordinal()] = 241;
        } catch (NoSuchFieldError unused241) {
        }
        try {
            iArr[SpeakerPhraseToken.TAKE_THE_TROLLEYBUS.ordinal()] = 242;
        } catch (NoSuchFieldError unused242) {
        }
        try {
            iArr[SpeakerPhraseToken.TAKE_THE_UNDERGROUND.ordinal()] = 243;
        } catch (NoSuchFieldError unused243) {
        }
        try {
            iArr[SpeakerPhraseToken.TAKE_THE_WATER_TRANSPORT.ordinal()] = 244;
        } catch (NoSuchFieldError unused244) {
        }
        try {
            iArr[SpeakerPhraseToken.TAKE_THE_TRANSPORT.ordinal()] = 245;
        } catch (NoSuchFieldError unused245) {
        }
        try {
            iArr[SpeakerPhraseToken.TUNNEL.ordinal()] = 246;
        } catch (NoSuchFieldError unused246) {
        }
        try {
            iArr[SpeakerPhraseToken.BRIDGE.ordinal()] = 247;
        } catch (NoSuchFieldError unused247) {
        }
        a = iArr;
    }
}
