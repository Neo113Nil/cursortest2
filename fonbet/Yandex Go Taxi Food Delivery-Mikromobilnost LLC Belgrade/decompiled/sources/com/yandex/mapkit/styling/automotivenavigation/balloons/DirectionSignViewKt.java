package com.yandex.mapkit.styling.automotivenavigation.balloons;

import com.yandex.mapkit.directions.driving.DirectionSignImage;
import com.yandex.mapkit.styling.automotivenavigation.R;
import defpackage.w511;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0003¨\u0006\u0003"}, d2 = {"toIconId", "", "Lcom/yandex/mapkit/directions/driving/DirectionSignImage;", "com.yandex.mapkit.styling.automotivenavigation_internalRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class DirectionSignViewKt {

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[DirectionSignImage.values().length];
            try {
                iArr[DirectionSignImage.RAILWAY_CROSSING_IMAGE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[DirectionSignImage.SKI_SLOPE_IMAGE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[DirectionSignImage.STADIUM_IMAGE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[DirectionSignImage.FREEWAY_IMAGE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[DirectionSignImage.BRIDGE_IMAGE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[DirectionSignImage.TUNNEL_IMAGE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[DirectionSignImage.FERRY_IMAGE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[DirectionSignImage.SUBWAY_STATION_IMAGE.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[DirectionSignImage.RAILWAY_STATION_IMAGE.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[DirectionSignImage.AIRPORT_IMAGE.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[DirectionSignImage.HOSPITAL_IMAGE.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[DirectionSignImage.BRIDGE_TR_IMAGE.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[DirectionSignImage.SUBWAY_STATION_TR_IMAGE.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr[DirectionSignImage.HOSPITAL_H_IMAGE.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr[DirectionSignImage.BEACH_IMAGE.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr[DirectionSignImage.BURJ_KHALIFA_IMAGE.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr[DirectionSignImage.GAS_IMAGE.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr[DirectionSignImage.HOTEL_IMAGE.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr[DirectionSignImage.KAABA_IMAGE.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                iArr[DirectionSignImage.MALL_IMAGE.ordinal()] = 20;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                iArr[DirectionSignImage.MOSQUE_IMAGE.ordinal()] = 21;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                iArr[DirectionSignImage.SUBWAY_U_A_E_IMAGE.ordinal()] = 22;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                iArr[DirectionSignImage.TRAM_U_A_E_IMAGE.ordinal()] = 23;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                iArr[DirectionSignImage.UNIVERSITY_IMAGE.ordinal()] = 24;
            } catch (NoSuchFieldError unused24) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int toIconId(DirectionSignImage directionSignImage) {
        switch (WhenMappings.$EnumSwitchMapping$0[directionSignImage.ordinal()]) {
            case 1:
                return R.drawable.mapkit_styling_automotive_roadsign_ic_railway_crossing;
            case 2:
                return R.drawable.mapkit_styling_automotive_roadsign_ic_ski_slope;
            case 3:
                return R.drawable.mapkit_styling_automotive_roadsign_ic_stadium;
            case 4:
                return R.drawable.mapkit_styling_automotive_roadsign_ic_freeway;
            case 5:
                return R.drawable.mapkit_styling_automotive_roadsign_ic_brige;
            case 6:
                return R.drawable.mapkit_styling_automotive_roadsign_ic_tunnel;
            case 7:
                return R.drawable.mapkit_styling_automotive_roadsign_ic_ferry;
            case 8:
                return R.drawable.mapkit_styling_automotive_roadsign_ic_subway_station;
            case 9:
                return R.drawable.mapkit_styling_automotive_roadsign_ic_railway_station;
            case 10:
                return R.drawable.mapkit_styling_automotive_roadsign_ic_airport;
            case 11:
                return R.drawable.mapkit_styling_automotive_roadsign_ic_hospital;
            case 12:
                return R.drawable.mapkit_styling_automotive_roadsign_ic_tr_brige;
            case 13:
                return R.drawable.mapkit_styling_automotive_roadsign_ic_tr_subway_station;
            case 14:
                return R.drawable.mapkit_styling_automotive_roadsign_ic_tr_hospital;
            case 15:
                return R.drawable.mapkit_styling_automotive_roadsign_ic_beach;
            case 16:
                return R.drawable.mapkit_styling_automotive_roadsign_ic_burj_khalifa;
            case 17:
                return R.drawable.mapkit_styling_automotive_roadsign_ic_gas;
            case 18:
                return R.drawable.mapkit_styling_automotive_roadsign_ic_hotel;
            case 19:
                return R.drawable.mapkit_styling_automotive_roadsign_ic_kaaba;
            case 20:
                return R.drawable.mapkit_styling_automotive_roadsign_ic_mall;
            case 21:
                return R.drawable.mapkit_styling_automotive_roadsign_ic_mosque;
            case 22:
                return R.drawable.mapkit_styling_automotive_roadsign_ic_uae_subway;
            case 23:
                return R.drawable.mapkit_styling_automotive_roadsign_ic_uae_tram;
            case 24:
                return R.drawable.mapkit_styling_automotive_roadsign_ic_university;
            default:
                w511.b();
                return 0;
        }
    }
}
