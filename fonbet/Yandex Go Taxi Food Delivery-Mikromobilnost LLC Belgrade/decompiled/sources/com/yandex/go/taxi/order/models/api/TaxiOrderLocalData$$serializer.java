package com.yandex.go.taxi.order.models.api;

import com.yandex.go.taxi.order.models.api.objects.SaveTime;
import com.yandex.go.taxi.order.models.api.objects.SaveTime$$serializer;
import defpackage.auu0;
import defpackage.h6w;
import defpackage.i3y;
import defpackage.jh70;
import defpackage.jl40;
import defpackage.jxi;
import defpackage.myi;
import defpackage.ny61;
import defpackage.ooc;
import defpackage.qke;
import defpackage.sjd;
import defpackage.urt;
import defpackage.uxs;
import defpackage.yjd;
import defpackage.z96;
import java.util.Map;
import java.util.Set;
import java.util.TimeZone;
import kotlin.Metadata;
import kotlin.collections.EmptySet;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import ru.CryptoPro.JCP.tools.SelfTester_JCP;
import ru.yandex.common.clid.ClidProvider;
import ru.yandex.taxi.object.DriveState;

@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/yandex/go/taxi/order/models/api/TaxiOrderLocalData.$serializer", "Luxs;", "Lcom/yandex/go/taxi/order/models/api/TaxiOrderLocalData;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Lzy11;", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/yandex/go/taxi/order/models/api/TaxiOrderLocalData;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/yandex/go/taxi/order/models/api/TaxiOrderLocalData;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
@jxi
/* loaded from: classes14.dex */
public final /* synthetic */ class TaxiOrderLocalData$$serializer implements uxs {
    public static final TaxiOrderLocalData$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        TaxiOrderLocalData$$serializer taxiOrderLocalData$$serializer = new TaxiOrderLocalData$$serializer();
        INSTANCE = taxiOrderLocalData$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.yandex.go.taxi.order.models.api.TaxiOrderLocalData", taxiOrderLocalData$$serializer, 56);
        pluginGeneratedSerialDescriptor.j(ClidProvider.APP_ACTIVE, true);
        pluginGeneratedSerialDescriptor.j("notifiedUserReady", true);
        pluginGeneratedSerialDescriptor.j("notifiedSaveRide", true);
        pluginGeneratedSerialDescriptor.j("tipsUserSelected", true);
        pluginGeneratedSerialDescriptor.j("cancelledByUser", true);
        pluginGeneratedSerialDescriptor.j("cancelledByAccident", true);
        pluginGeneratedSerialDescriptor.j("isNotifiedAboutCancellation", true);
        pluginGeneratedSerialDescriptor.j("isNotifiedAboutOnDriving", true);
        pluginGeneratedSerialDescriptor.j("isNotifiedAboutMultiorder", true);
        pluginGeneratedSerialDescriptor.j("isNotifiedAboutCashback", true);
        pluginGeneratedSerialDescriptor.j("chatMessageSentOnce", true);
        pluginGeneratedSerialDescriptor.j("chatGreetingClearedOnce", true);
        pluginGeneratedSerialDescriptor.j("paidDiscountDialogShowed", true);
        pluginGeneratedSerialDescriptor.j("tariffUpgradeShowed", true);
        pluginGeneratedSerialDescriptor.j("feedbackSentOnce", true);
        pluginGeneratedSerialDescriptor.j("isForceDestinationShowed", true);
        pluginGeneratedSerialDescriptor.j("isFailed", true);
        pluginGeneratedSerialDescriptor.j("isPaidTimerShowed", true);
        pluginGeneratedSerialDescriptor.j("isFreeTimerShowed", true);
        pluginGeneratedSerialDescriptor.j("communicationButtonShown", true);
        pluginGeneratedSerialDescriptor.j("hasDebt", true);
        pluginGeneratedSerialDescriptor.j("paymentChangesCount", true);
        pluginGeneratedSerialDescriptor.j("bookingTimerStarted", true);
        pluginGeneratedSerialDescriptor.j("isInstructionShown", true);
        pluginGeneratedSerialDescriptor.j("closedCompleteScreen", true);
        pluginGeneratedSerialDescriptor.j("trackingOnlyFeedback", true);
        pluginGeneratedSerialDescriptor.j("walkingRouteActive", true);
        pluginGeneratedSerialDescriptor.j("walkingRouteClosed", true);
        pluginGeneratedSerialDescriptor.j("isPaymentChanged", true);
        pluginGeneratedSerialDescriptor.j("isCancelByOrderCancelNotification", true);
        pluginGeneratedSerialDescriptor.j("driverAnalyticSentForState", true);
        pluginGeneratedSerialDescriptor.j("googlePayCardId", true);
        pluginGeneratedSerialDescriptor.j("saveTime", true);
        pluginGeneratedSerialDescriptor.j("lastNotifiedState", true);
        pluginGeneratedSerialDescriptor.j("timeZone", true);
        pluginGeneratedSerialDescriptor.j("pickupPointAnalyticsData", true);
        pluginGeneratedSerialDescriptor.j("dropOffPointAnalyticsData", true);
        pluginGeneratedSerialDescriptor.j("notificationGroupKey", true);
        pluginGeneratedSerialDescriptor.j("aliases", true);
        pluginGeneratedSerialDescriptor.j("foregroundNotificationOverrides", true);
        pluginGeneratedSerialDescriptor.j("travelCompanionAnimationsShowCount", true);
        pluginGeneratedSerialDescriptor.j("dismissedByUserNotificationsIds", true);
        pluginGeneratedSerialDescriptor.j("shownUpsellIds", true);
        pluginGeneratedSerialDescriptor.j("clickedUpsellIds", true);
        pluginGeneratedSerialDescriptor.j("feedback_question_requested", true);
        pluginGeneratedSerialDescriptor.j("feedback_question", true);
        pluginGeneratedSerialDescriptor.j("shownCommunicationsIds", true);
        pluginGeneratedSerialDescriptor.j("previouslyUpdatedDriveState", true);
        pluginGeneratedSerialDescriptor.j("feedback_localData", true);
        pluginGeneratedSerialDescriptor.j("cancel_silently", true);
        pluginGeneratedSerialDescriptor.j("need_open_details", true);
        pluginGeneratedSerialDescriptor.j("trace_id", true);
        pluginGeneratedSerialDescriptor.j("complete_polling_enabled", true);
        pluginGeneratedSerialDescriptor.j("hidden_map_objects_ids", true);
        pluginGeneratedSerialDescriptor.j("was_force_attracted_on_feed", true);
        pluginGeneratedSerialDescriptor.j("validated_order_status_window", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private TaxiOrderLocalData$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        i3y[] i3yVarArr = TaxiOrderLocalData.e0;
        z96 z96Var = z96.a;
        auu0 auu0Var = auu0.a;
        jh70 jh70Var = jh70.e;
        return new KSerializer[]{z96Var, z96Var, z96Var, z96Var, z96Var, z96Var, z96Var, z96Var, z96Var, z96Var, z96Var, z96Var, z96Var, z96Var, z96Var, z96Var, z96Var, z96Var, z96Var, z96Var, z96Var, h6w.a, z96Var, z96Var, z96Var, z96Var, z96Var, z96Var, z96Var, z96Var, qke.n((KSerializer) i3yVarArr[30].getValue()), qke.n(auu0Var), qke.n(SaveTime$$serializer.INSTANCE), qke.n((KSerializer) i3yVarArr[33].getValue()), urt.a, qke.n(jh70Var), qke.n(jh70Var), qke.n(auu0Var), i3yVarArr[38].getValue(), i3yVarArr[39].getValue(), i3yVarArr[40].getValue(), i3yVarArr[41].getValue(), i3yVarArr[42].getValue(), i3yVarArr[43].getValue(), z96Var, qke.n(TaxiOrderFeedbackQuestion$$serializer.INSTANCE), i3yVarArr[46].getValue(), i3yVarArr[47].getValue(), TaxiOrderFeedback$$serializer.INSTANCE, z96Var, z96Var, qke.n(auu0Var), z96Var, i3yVarArr[53].getValue(), i3yVarArr[54].getValue(), qke.n((KSerializer) i3yVarArr[55].getValue())};
    }

    @Override // defpackage.myi
    public final TaxiOrderLocalData deserialize(Decoder decoder) {
        Map map;
        int i;
        Map map2;
        int i2;
        TaxiOrderFeedback taxiOrderFeedback;
        Map map3;
        int i3;
        int i4;
        Map map4;
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3y[] i3yVarArr = TaxiOrderLocalData.e0;
        b.getClass();
        TaxiOrderFeedback taxiOrderFeedback2 = null;
        DriveState driveState = null;
        Set set = null;
        TaxiOrderFeedbackQuestion taxiOrderFeedbackQuestion = null;
        String str = null;
        Set set2 = null;
        Set set3 = null;
        int i5 = 0;
        Set set4 = null;
        Set set5 = null;
        Map map5 = null;
        Map map6 = null;
        Map map7 = null;
        Set set6 = null;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        boolean z4 = false;
        boolean z5 = false;
        boolean z6 = false;
        boolean z7 = false;
        boolean z8 = false;
        boolean z9 = false;
        boolean z10 = false;
        boolean z11 = false;
        boolean z12 = false;
        boolean z13 = false;
        boolean z14 = false;
        boolean z15 = false;
        int i6 = 0;
        boolean z16 = false;
        boolean z17 = false;
        boolean z18 = false;
        boolean z19 = false;
        boolean z20 = false;
        boolean z21 = false;
        boolean z22 = false;
        boolean z23 = false;
        boolean z24 = true;
        boolean z25 = false;
        boolean z26 = false;
        boolean z27 = false;
        boolean z28 = false;
        boolean z29 = false;
        boolean z30 = false;
        int i7 = 0;
        DriveState driveState2 = null;
        String str2 = null;
        SaveTime saveTime = null;
        DriveState driveState3 = null;
        boolean z31 = false;
        TimeZone timeZone = null;
        com.yandex.go.analytics.e eVar = null;
        com.yandex.go.analytics.e eVar2 = null;
        String str3 = null;
        boolean z32 = false;
        boolean z33 = false;
        Set set7 = null;
        boolean z34 = false;
        while (z24) {
            int v = b.v(serialDescriptor);
            switch (v) {
                case -1:
                    map = map7;
                    i = i7;
                    z24 = false;
                    map6 = map6;
                    taxiOrderFeedback2 = taxiOrderFeedback2;
                    i7 = i;
                    map7 = map;
                case 0:
                    map2 = map6;
                    map = map7;
                    i2 = i7 | 1;
                    z25 = b.C(serialDescriptor, 0);
                    taxiOrderFeedback2 = taxiOrderFeedback2;
                    i = i2;
                    map6 = map2;
                    i7 = i;
                    map7 = map;
                case 1:
                    map2 = map6;
                    map = map7;
                    i2 = i7 | 2;
                    z26 = b.C(serialDescriptor, 1);
                    taxiOrderFeedback2 = taxiOrderFeedback2;
                    i = i2;
                    map6 = map2;
                    i7 = i;
                    map7 = map;
                case 2:
                    taxiOrderFeedback = taxiOrderFeedback2;
                    map3 = map6;
                    map = map7;
                    i = i7 | 4;
                    z27 = b.C(serialDescriptor, 2);
                    map6 = map3;
                    taxiOrderFeedback2 = taxiOrderFeedback;
                    i7 = i;
                    map7 = map;
                case 3:
                    taxiOrderFeedback = taxiOrderFeedback2;
                    map3 = map6;
                    map = map7;
                    i = i7 | 8;
                    z28 = b.C(serialDescriptor, 3);
                    map6 = map3;
                    taxiOrderFeedback2 = taxiOrderFeedback;
                    i7 = i;
                    map7 = map;
                case 4:
                    taxiOrderFeedback = taxiOrderFeedback2;
                    map3 = map6;
                    map = map7;
                    i = i7 | 16;
                    z29 = b.C(serialDescriptor, 4);
                    map6 = map3;
                    taxiOrderFeedback2 = taxiOrderFeedback;
                    i7 = i;
                    map7 = map;
                case 5:
                    taxiOrderFeedback = taxiOrderFeedback2;
                    map3 = map6;
                    map = map7;
                    i = i7 | 32;
                    z30 = b.C(serialDescriptor, 5);
                    map6 = map3;
                    taxiOrderFeedback2 = taxiOrderFeedback;
                    i7 = i;
                    map7 = map;
                case 6:
                    taxiOrderFeedback = taxiOrderFeedback2;
                    map3 = map6;
                    map = map7;
                    z = b.C(serialDescriptor, 6);
                    i3 = i7 | 64;
                    i = i3;
                    map6 = map3;
                    taxiOrderFeedback2 = taxiOrderFeedback;
                    i7 = i;
                    map7 = map;
                case 7:
                    taxiOrderFeedback = taxiOrderFeedback2;
                    map3 = map6;
                    map = map7;
                    z2 = b.C(serialDescriptor, 7);
                    i3 = i7 | 128;
                    i = i3;
                    map6 = map3;
                    taxiOrderFeedback2 = taxiOrderFeedback;
                    i7 = i;
                    map7 = map;
                case 8:
                    taxiOrderFeedback = taxiOrderFeedback2;
                    map3 = map6;
                    map = map7;
                    z3 = b.C(serialDescriptor, 8);
                    i3 = i7 | 256;
                    i = i3;
                    map6 = map3;
                    taxiOrderFeedback2 = taxiOrderFeedback;
                    i7 = i;
                    map7 = map;
                case 9:
                    taxiOrderFeedback = taxiOrderFeedback2;
                    map3 = map6;
                    map = map7;
                    z4 = b.C(serialDescriptor, 9);
                    i3 = i7 | 512;
                    i = i3;
                    map6 = map3;
                    taxiOrderFeedback2 = taxiOrderFeedback;
                    i7 = i;
                    map7 = map;
                case 10:
                    taxiOrderFeedback = taxiOrderFeedback2;
                    map3 = map6;
                    map = map7;
                    z5 = b.C(serialDescriptor, 10);
                    i3 = i7 | 1024;
                    i = i3;
                    map6 = map3;
                    taxiOrderFeedback2 = taxiOrderFeedback;
                    i7 = i;
                    map7 = map;
                case 11:
                    taxiOrderFeedback = taxiOrderFeedback2;
                    map3 = map6;
                    map = map7;
                    z6 = b.C(serialDescriptor, 11);
                    i3 = i7 | 2048;
                    i = i3;
                    map6 = map3;
                    taxiOrderFeedback2 = taxiOrderFeedback;
                    i7 = i;
                    map7 = map;
                case 12:
                    taxiOrderFeedback = taxiOrderFeedback2;
                    map3 = map6;
                    map = map7;
                    z7 = b.C(serialDescriptor, 12);
                    i3 = i7 | 4096;
                    i = i3;
                    map6 = map3;
                    taxiOrderFeedback2 = taxiOrderFeedback;
                    i7 = i;
                    map7 = map;
                case 13:
                    taxiOrderFeedback = taxiOrderFeedback2;
                    map3 = map6;
                    map = map7;
                    z8 = b.C(serialDescriptor, 13);
                    i3 = i7 | 8192;
                    i = i3;
                    map6 = map3;
                    taxiOrderFeedback2 = taxiOrderFeedback;
                    i7 = i;
                    map7 = map;
                case 14:
                    taxiOrderFeedback = taxiOrderFeedback2;
                    map3 = map6;
                    map = map7;
                    z9 = b.C(serialDescriptor, 14);
                    i3 = i7 | 16384;
                    i = i3;
                    map6 = map3;
                    taxiOrderFeedback2 = taxiOrderFeedback;
                    i7 = i;
                    map7 = map;
                case 15:
                    taxiOrderFeedback = taxiOrderFeedback2;
                    map3 = map6;
                    map = map7;
                    z10 = b.C(serialDescriptor, 15);
                    i3 = i7 | 32768;
                    i = i3;
                    map6 = map3;
                    taxiOrderFeedback2 = taxiOrderFeedback;
                    i7 = i;
                    map7 = map;
                case 16:
                    taxiOrderFeedback = taxiOrderFeedback2;
                    map3 = map6;
                    map = map7;
                    z11 = b.C(serialDescriptor, 16);
                    i3 = i7 | 65536;
                    i = i3;
                    map6 = map3;
                    taxiOrderFeedback2 = taxiOrderFeedback;
                    i7 = i;
                    map7 = map;
                case 17:
                    taxiOrderFeedback = taxiOrderFeedback2;
                    map3 = map6;
                    map = map7;
                    z12 = b.C(serialDescriptor, 17);
                    i3 = i7 | 131072;
                    i = i3;
                    map6 = map3;
                    taxiOrderFeedback2 = taxiOrderFeedback;
                    i7 = i;
                    map7 = map;
                case 18:
                    taxiOrderFeedback = taxiOrderFeedback2;
                    map3 = map6;
                    map = map7;
                    z13 = b.C(serialDescriptor, 18);
                    i3 = i7 | 262144;
                    i = i3;
                    map6 = map3;
                    taxiOrderFeedback2 = taxiOrderFeedback;
                    i7 = i;
                    map7 = map;
                case 19:
                    taxiOrderFeedback = taxiOrderFeedback2;
                    map3 = map6;
                    map = map7;
                    z14 = b.C(serialDescriptor, 19);
                    i3 = i7 | 524288;
                    i = i3;
                    map6 = map3;
                    taxiOrderFeedback2 = taxiOrderFeedback;
                    i7 = i;
                    map7 = map;
                case 20:
                    taxiOrderFeedback = taxiOrderFeedback2;
                    map3 = map6;
                    map = map7;
                    z15 = b.C(serialDescriptor, 20);
                    i3 = i7 | 1048576;
                    i = i3;
                    map6 = map3;
                    taxiOrderFeedback2 = taxiOrderFeedback;
                    i7 = i;
                    map7 = map;
                case 21:
                    taxiOrderFeedback = taxiOrderFeedback2;
                    map3 = map6;
                    map = map7;
                    i6 = b.h(serialDescriptor, 21);
                    i3 = i7 | 2097152;
                    i = i3;
                    map6 = map3;
                    taxiOrderFeedback2 = taxiOrderFeedback;
                    i7 = i;
                    map7 = map;
                case 22:
                    taxiOrderFeedback = taxiOrderFeedback2;
                    map3 = map6;
                    map = map7;
                    z16 = b.C(serialDescriptor, 22);
                    i3 = i7 | SelfTester_JCP.ENCRYPT_CBC;
                    i = i3;
                    map6 = map3;
                    taxiOrderFeedback2 = taxiOrderFeedback;
                    i7 = i;
                    map7 = map;
                case 23:
                    taxiOrderFeedback = taxiOrderFeedback2;
                    map3 = map6;
                    map = map7;
                    z17 = b.C(serialDescriptor, 23);
                    i3 = i7 | SelfTester_JCP.ENCRYPT_CNT;
                    i = i3;
                    map6 = map3;
                    taxiOrderFeedback2 = taxiOrderFeedback;
                    i7 = i;
                    map7 = map;
                case 24:
                    taxiOrderFeedback = taxiOrderFeedback2;
                    map3 = map6;
                    map = map7;
                    z18 = b.C(serialDescriptor, 24);
                    i4 = 16777216;
                    i3 = i7 | i4;
                    i = i3;
                    map6 = map3;
                    taxiOrderFeedback2 = taxiOrderFeedback;
                    i7 = i;
                    map7 = map;
                case 25:
                    taxiOrderFeedback = taxiOrderFeedback2;
                    map3 = map6;
                    map = map7;
                    z19 = b.C(serialDescriptor, 25);
                    i4 = SelfTester_JCP.DECRYPT_CFB;
                    i3 = i7 | i4;
                    i = i3;
                    map6 = map3;
                    taxiOrderFeedback2 = taxiOrderFeedback;
                    i7 = i;
                    map7 = map;
                case 26:
                    taxiOrderFeedback = taxiOrderFeedback2;
                    map3 = map6;
                    map = map7;
                    z20 = b.C(serialDescriptor, 26);
                    i4 = SelfTester_JCP.DECRYPT_CBC;
                    i3 = i7 | i4;
                    i = i3;
                    map6 = map3;
                    taxiOrderFeedback2 = taxiOrderFeedback;
                    i7 = i;
                    map7 = map;
                case 27:
                    taxiOrderFeedback = taxiOrderFeedback2;
                    map3 = map6;
                    map = map7;
                    z21 = b.C(serialDescriptor, 27);
                    i4 = SelfTester_JCP.DECRYPT_CNT;
                    i3 = i7 | i4;
                    i = i3;
                    map6 = map3;
                    taxiOrderFeedback2 = taxiOrderFeedback;
                    i7 = i;
                    map7 = map;
                case 28:
                    taxiOrderFeedback = taxiOrderFeedback2;
                    map3 = map6;
                    map = map7;
                    z22 = b.C(serialDescriptor, 28);
                    i4 = SelfTester_JCP.IMITA;
                    i3 = i7 | i4;
                    i = i3;
                    map6 = map3;
                    taxiOrderFeedback2 = taxiOrderFeedback;
                    i7 = i;
                    map7 = map;
                case 29:
                    taxiOrderFeedback = taxiOrderFeedback2;
                    map3 = map6;
                    map = map7;
                    z23 = b.C(serialDescriptor, 29);
                    i4 = 536870912;
                    i3 = i7 | i4;
                    i = i3;
                    map6 = map3;
                    taxiOrderFeedback2 = taxiOrderFeedback;
                    i7 = i;
                    map7 = map;
                case 30:
                    taxiOrderFeedback = taxiOrderFeedback2;
                    map3 = map6;
                    map = map7;
                    i3 = i7 | 1073741824;
                    driveState2 = (DriveState) b.s(serialDescriptor, 30, (myi) i3yVarArr[30].getValue(), driveState2);
                    i = i3;
                    map6 = map3;
                    taxiOrderFeedback2 = taxiOrderFeedback;
                    i7 = i;
                    map7 = map;
                case 31:
                    taxiOrderFeedback = taxiOrderFeedback2;
                    map3 = map6;
                    map = map7;
                    i3 = i7 | Integer.MIN_VALUE;
                    str2 = (String) b.s(serialDescriptor, 31, auu0.a, str2);
                    i = i3;
                    map6 = map3;
                    taxiOrderFeedback2 = taxiOrderFeedback;
                    i7 = i;
                    map7 = map;
                case 32:
                    taxiOrderFeedback = taxiOrderFeedback2;
                    map3 = map6;
                    map = map7;
                    i5 |= 1;
                    saveTime = (SaveTime) b.s(serialDescriptor, 32, SaveTime$$serializer.INSTANCE, saveTime);
                    i = i7;
                    map6 = map3;
                    taxiOrderFeedback2 = taxiOrderFeedback;
                    i7 = i;
                    map7 = map;
                case 33:
                    taxiOrderFeedback = taxiOrderFeedback2;
                    map3 = map6;
                    map = map7;
                    i5 |= 2;
                    driveState3 = (DriveState) b.s(serialDescriptor, 33, (myi) i3yVarArr[33].getValue(), driveState3);
                    i = i7;
                    map6 = map3;
                    taxiOrderFeedback2 = taxiOrderFeedback;
                    i7 = i;
                    map7 = map;
                case 34:
                    taxiOrderFeedback = taxiOrderFeedback2;
                    map3 = map6;
                    map = map7;
                    i5 |= 4;
                    timeZone = (TimeZone) b.A(serialDescriptor, 34, urt.a, timeZone);
                    i = i7;
                    map6 = map3;
                    taxiOrderFeedback2 = taxiOrderFeedback;
                    i7 = i;
                    map7 = map;
                case 35:
                    taxiOrderFeedback = taxiOrderFeedback2;
                    map3 = map6;
                    map = map7;
                    i5 |= 8;
                    eVar = (com.yandex.go.analytics.e) b.s(serialDescriptor, 35, jh70.e, eVar);
                    i = i7;
                    map6 = map3;
                    taxiOrderFeedback2 = taxiOrderFeedback;
                    i7 = i;
                    map7 = map;
                case 36:
                    taxiOrderFeedback = taxiOrderFeedback2;
                    map3 = map6;
                    map = map7;
                    i5 |= 16;
                    eVar2 = (com.yandex.go.analytics.e) b.s(serialDescriptor, 36, jh70.e, eVar2);
                    i = i7;
                    map6 = map3;
                    taxiOrderFeedback2 = taxiOrderFeedback;
                    i7 = i;
                    map7 = map;
                case 37:
                    taxiOrderFeedback = taxiOrderFeedback2;
                    map3 = map6;
                    map = map7;
                    i5 |= 32;
                    str3 = (String) b.s(serialDescriptor, 37, auu0.a, str3);
                    i = i7;
                    map6 = map3;
                    taxiOrderFeedback2 = taxiOrderFeedback;
                    i7 = i;
                    map7 = map;
                case 38:
                    taxiOrderFeedback = taxiOrderFeedback2;
                    map = map7;
                    map3 = map6;
                    i5 |= 64;
                    set7 = (Set) b.A(serialDescriptor, 38, (myi) i3yVarArr[38].getValue(), set7);
                    i = i7;
                    map6 = map3;
                    taxiOrderFeedback2 = taxiOrderFeedback;
                    i7 = i;
                    map7 = map;
                case 39:
                    taxiOrderFeedback = taxiOrderFeedback2;
                    map = map7;
                    map6 = (Map) b.A(serialDescriptor, 39, (myi) i3yVarArr[39].getValue(), map6);
                    i5 |= 128;
                    i = i7;
                    taxiOrderFeedback2 = taxiOrderFeedback;
                    i7 = i;
                    map7 = map;
                case 40:
                    map3 = map6;
                    taxiOrderFeedback = taxiOrderFeedback2;
                    i5 |= 256;
                    map = (Map) b.A(serialDescriptor, 40, (myi) i3yVarArr[40].getValue(), map7);
                    i = i7;
                    map6 = map3;
                    taxiOrderFeedback2 = taxiOrderFeedback;
                    i7 = i;
                    map7 = map;
                case 41:
                    map4 = map6;
                    map = map7;
                    set6 = (Set) b.A(serialDescriptor, 41, (myi) i3yVarArr[41].getValue(), set6);
                    i5 |= 512;
                    i = i7;
                    map6 = map4;
                    i7 = i;
                    map7 = map;
                case 42:
                    map4 = map6;
                    map = map7;
                    set3 = (Set) b.A(serialDescriptor, 42, (myi) i3yVarArr[42].getValue(), set3);
                    i5 |= 1024;
                    i = i7;
                    map6 = map4;
                    i7 = i;
                    map7 = map;
                case 43:
                    map4 = map6;
                    map = map7;
                    set2 = (Set) b.A(serialDescriptor, 43, (myi) i3yVarArr[43].getValue(), set2);
                    i5 |= 2048;
                    i = i7;
                    map6 = map4;
                    i7 = i;
                    map7 = map;
                case 44:
                    map4 = map6;
                    map = map7;
                    z31 = b.C(serialDescriptor, 44);
                    i5 |= 4096;
                    i = i7;
                    map6 = map4;
                    i7 = i;
                    map7 = map;
                case 45:
                    map4 = map6;
                    map = map7;
                    taxiOrderFeedbackQuestion = (TaxiOrderFeedbackQuestion) b.s(serialDescriptor, 45, TaxiOrderFeedbackQuestion$$serializer.INSTANCE, taxiOrderFeedbackQuestion);
                    i5 |= 8192;
                    i = i7;
                    map6 = map4;
                    i7 = i;
                    map7 = map;
                case 46:
                    map4 = map6;
                    map = map7;
                    set = (Set) b.A(serialDescriptor, 46, (myi) i3yVarArr[46].getValue(), set);
                    i5 |= 16384;
                    i = i7;
                    map6 = map4;
                    i7 = i;
                    map7 = map;
                case 47:
                    map4 = map6;
                    map = map7;
                    driveState = (DriveState) b.A(serialDescriptor, 47, (myi) i3yVarArr[47].getValue(), driveState);
                    i5 |= 32768;
                    i = i7;
                    map6 = map4;
                    i7 = i;
                    map7 = map;
                case 48:
                    map4 = map6;
                    map = map7;
                    taxiOrderFeedback2 = (TaxiOrderFeedback) b.A(serialDescriptor, 48, TaxiOrderFeedback$$serializer.INSTANCE, taxiOrderFeedback2);
                    i5 |= 65536;
                    i = i7;
                    map6 = map4;
                    i7 = i;
                    map7 = map;
                case 49:
                    map4 = map6;
                    map = map7;
                    z32 = b.C(serialDescriptor, 49);
                    i5 |= 131072;
                    i = i7;
                    map6 = map4;
                    i7 = i;
                    map7 = map;
                case 50:
                    map4 = map6;
                    map = map7;
                    z33 = b.C(serialDescriptor, 50);
                    i5 |= 262144;
                    i = i7;
                    map6 = map4;
                    i7 = i;
                    map7 = map;
                case SAFETY_TIPS_VALUE:
                    map4 = map6;
                    map = map7;
                    str = (String) b.s(serialDescriptor, 51, auu0.a, str);
                    i5 |= 524288;
                    i = i7;
                    map6 = map4;
                    i7 = i;
                    map7 = map;
                case 52:
                    map4 = map6;
                    map = map7;
                    z34 = b.C(serialDescriptor, 52);
                    i5 |= 1048576;
                    i = i7;
                    map6 = map4;
                    i7 = i;
                    map7 = map;
                case 53:
                    map4 = map6;
                    map = map7;
                    set4 = (Set) b.A(serialDescriptor, 53, (myi) i3yVarArr[53].getValue(), set4);
                    i5 |= 2097152;
                    i = i7;
                    map6 = map4;
                    i7 = i;
                    map7 = map;
                case 54:
                    map4 = map6;
                    map = map7;
                    set5 = (Set) b.A(serialDescriptor, 54, (myi) i3yVarArr[54].getValue(), set5);
                    i5 |= SelfTester_JCP.ENCRYPT_CBC;
                    i = i7;
                    map6 = map4;
                    i7 = i;
                    map7 = map;
                case SODA_DE_DE_VALUE:
                    map4 = map6;
                    map = map7;
                    map5 = (Map) b.s(serialDescriptor, 55, (myi) i3yVarArr[55].getValue(), map5);
                    i5 |= SelfTester_JCP.ENCRYPT_CNT;
                    i = i7;
                    map6 = map4;
                    i7 = i;
                    map7 = map;
                default:
                    ny61.c(v);
                    return null;
            }
        }
        TaxiOrderFeedback taxiOrderFeedback3 = taxiOrderFeedback2;
        int i8 = i7;
        DriveState driveState4 = driveState2;
        b.c(serialDescriptor);
        return new TaxiOrderLocalData(i8, i5, z25, z26, z27, z28, z29, z30, z, z2, z3, z4, z5, z6, z7, z8, z9, z10, z11, z12, z13, z14, z15, i6, z16, z17, z18, z19, z20, z21, z22, z23, driveState4, str2, saveTime, driveState3, timeZone, eVar, eVar2, str3, set7, map6, map7, set6, set3, set2, z31, taxiOrderFeedbackQuestion, set, driveState, taxiOrderFeedback3, z32, z33, str, z34, set4, set5, map5);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    /* JADX WARN: Code restructure failed: missing block: B:196:0x0402, code lost:
    
        if (defpackage.jl40.l(r1, com.yandex.go.taxi.order.models.api.TaxiOrderFeedback.j) == false) goto L295;
     */
    @Override // kotlinx.serialization.KSerializer
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void serialize(Encoder encoder, TaxiOrderLocalData value) {
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        i3y[] i3yVarArr = TaxiOrderLocalData.e0;
        if (b.F() || value.a) {
            b.n(serialDescriptor, 0, value.a);
        }
        if (b.F() || value.b) {
            b.n(serialDescriptor, 1, value.b);
        }
        if (b.F() || value.c) {
            b.n(serialDescriptor, 2, value.c);
        }
        if (b.F() || value.d) {
            b.n(serialDescriptor, 3, value.d);
        }
        if (b.F() || value.e) {
            b.n(serialDescriptor, 4, value.e);
        }
        if (b.F() || value.f) {
            b.n(serialDescriptor, 5, value.f);
        }
        if (b.F() || value.g) {
            b.n(serialDescriptor, 6, value.g);
        }
        if (b.F() || value.h) {
            b.n(serialDescriptor, 7, value.h);
        }
        if (b.F() || value.i) {
            b.n(serialDescriptor, 8, value.i);
        }
        if (b.F() || value.j) {
            b.n(serialDescriptor, 9, value.j);
        }
        if (b.F() || value.k) {
            b.n(serialDescriptor, 10, value.k);
        }
        if (b.F() || value.l) {
            b.n(serialDescriptor, 11, value.l);
        }
        if (b.F() || value.m) {
            b.n(serialDescriptor, 12, value.m);
        }
        if (b.F() || value.n) {
            b.n(serialDescriptor, 13, value.n);
        }
        if (b.F() || value.o) {
            b.n(serialDescriptor, 14, value.o);
        }
        if (b.F() || value.p) {
            b.n(serialDescriptor, 15, value.p);
        }
        if (b.F() || value.q) {
            b.n(serialDescriptor, 16, value.q);
        }
        if (b.F() || value.r) {
            b.n(serialDescriptor, 17, value.r);
        }
        if (b.F() || value.s) {
            b.n(serialDescriptor, 18, value.s);
        }
        if (b.F() || value.t) {
            b.n(serialDescriptor, 19, value.t);
        }
        if (b.F() || value.u) {
            b.n(serialDescriptor, 20, value.u);
        }
        if (b.F() || value.v != 0) {
            b.A(21, value.v, serialDescriptor);
        }
        if (b.F() || value.w) {
            b.n(serialDescriptor, 22, value.w);
        }
        if (b.F() || value.x) {
            b.n(serialDescriptor, 23, value.x);
        }
        if (b.F() || value.y) {
            b.n(serialDescriptor, 24, value.y);
        }
        if (b.F() || value.z) {
            b.n(serialDescriptor, 25, value.z);
        }
        if (b.F() || value.A) {
            b.n(serialDescriptor, 26, value.A);
        }
        if (b.F() || value.B) {
            b.n(serialDescriptor, 27, value.B);
        }
        if (b.F() || value.C) {
            b.n(serialDescriptor, 28, value.C);
        }
        if (b.F() || value.D) {
            b.n(serialDescriptor, 29, value.D);
        }
        if (b.F() || value.E != null) {
            b.g(serialDescriptor, 30, (KSerializer) i3yVarArr[30].getValue(), value.E);
        }
        if (b.F() || value.F != null) {
            b.g(serialDescriptor, 31, auu0.a, value.F);
        }
        if (b.F() || value.G != null) {
            b.g(serialDescriptor, 32, SaveTime$$serializer.INSTANCE, value.G);
        }
        if (b.F() || value.H != null) {
            b.g(serialDescriptor, 33, (KSerializer) i3yVarArr[33].getValue(), value.H);
        }
        if (b.F() || !jl40.l(value.I, TimeZone.getDefault())) {
            b.e(serialDescriptor, 34, urt.a, value.I);
        }
        if (b.F() || value.J != null) {
            b.g(serialDescriptor, 35, jh70.e, value.J);
        }
        if (b.F() || value.K != null) {
            b.g(serialDescriptor, 36, jh70.e, value.K);
        }
        if (b.F() || value.L != null) {
            b.g(serialDescriptor, 37, auu0.a, value.L);
        }
        boolean F = b.F();
        EmptySet emptySet = EmptySet.a;
        if (F || !jl40.l(value.M, emptySet)) {
            b.e(serialDescriptor, 38, (KSerializer) i3yVarArr[38].getValue(), value.M);
        }
        if (b.F() || !jl40.l(value.N, kotlin.collections.b.f())) {
            b.e(serialDescriptor, 39, (KSerializer) i3yVarArr[39].getValue(), value.N);
        }
        if (b.F() || !jl40.l(value.O, kotlin.collections.b.f())) {
            b.e(serialDescriptor, 40, (KSerializer) i3yVarArr[40].getValue(), value.O);
        }
        if (b.F() || !jl40.l(value.P, emptySet)) {
            b.e(serialDescriptor, 41, (KSerializer) i3yVarArr[41].getValue(), value.P);
        }
        if (b.F() || !jl40.l(value.Q, emptySet)) {
            b.e(serialDescriptor, 42, (KSerializer) i3yVarArr[42].getValue(), value.Q);
        }
        if (b.F() || !jl40.l(value.R, emptySet)) {
            b.e(serialDescriptor, 43, (KSerializer) i3yVarArr[43].getValue(), value.R);
        }
        if (b.F() || value.S) {
            b.n(serialDescriptor, 44, value.S);
        }
        if (b.F() || value.T != null) {
            b.g(serialDescriptor, 45, TaxiOrderFeedbackQuestion$$serializer.INSTANCE, value.T);
        }
        if (b.F() || !jl40.l(value.U, emptySet)) {
            b.e(serialDescriptor, 46, (KSerializer) i3yVarArr[46].getValue(), value.U);
        }
        if (b.F() || value.V != DriveState.PREORDER) {
            b.e(serialDescriptor, 47, (KSerializer) i3yVarArr[47].getValue(), value.V);
        }
        if (!b.F()) {
            TaxiOrderFeedback taxiOrderFeedback = value.W;
            TaxiOrderFeedback.Companion.getClass();
        }
        b.e(serialDescriptor, 48, TaxiOrderFeedback$$serializer.INSTANCE, value.W);
        if (b.F() || value.X) {
            b.n(serialDescriptor, 49, value.X);
        }
        if (b.F() || value.Y) {
            b.n(serialDescriptor, 50, value.Y);
        }
        if (b.F() || value.Z != null) {
            b.g(serialDescriptor, 51, auu0.a, value.Z);
        }
        if (b.F() || value.a0) {
            b.n(serialDescriptor, 52, value.a0);
        }
        if (b.F() || !jl40.l(value.b0, emptySet)) {
            b.e(serialDescriptor, 53, (KSerializer) i3yVarArr[53].getValue(), value.b0);
        }
        if (b.F() || !jl40.l(value.c0, emptySet)) {
            b.e(serialDescriptor, 54, (KSerializer) i3yVarArr[54].getValue(), value.c0);
        }
        if (b.F() || value.d0 != null) {
            b.g(serialDescriptor, 55, (KSerializer) i3yVarArr[55].getValue(), value.d0);
        }
        b.c(serialDescriptor);
    }

    @Override // defpackage.uxs
    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return ooc.d;
    }
}
