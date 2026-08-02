package defpackage;

/* loaded from: classes10.dex */
public final class m94 implements sls {
    public final /* synthetic */ int a;
    public static final m94 b = new m94(0);
    public static final m94 c = new m94(1);
    public static final m94 w = new m94(2);
    public static final m94 x = new m94(3);
    public static final m94 y = new m94(4);
    public static final m94 z = new m94(5);
    public static final m94 A = new m94(6);
    public static final m94 B = new m94(7);
    public static final m94 C = new m94(8);
    public static final m94 D = new m94(9);
    public static final m94 E = new m94(10);
    public static final m94 F = new m94(11);
    public static final m94 G = new m94(12);
    public static final m94 H = new m94(13);
    public static final m94 I = new m94(14);
    public static final m94 J = new m94(15);
    public static final m94 K = new m94(16);
    public static final m94 L = new m94(17);
    public static final m94 M = new m94(18);
    public static final m94 N = new m94(19);
    public static final m94 O = new m94(20);
    public static final m94 P = new m94(21);
    public static final m94 Q = new m94(22);
    public static final m94 R = new m94(23);
    public static final m94 S = new m94(24);
    public static final m94 T = new m94(25);
    public static final m94 U = new m94(26);
    public static final m94 V = new m94(27);
    public static final m94 W = new m94(28);
    public static final m94 Z = new m94(29);

    public /* synthetic */ m94(int i) {
        this.a = i;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        switch (this.a) {
            case 0:
                return new ldc(rzo.d(1308617531));
            case 1:
                return null;
            case 2:
                return "fail to update driver state";
            case 3:
                return "fail to get orderHolder";
            case 4:
                return "Failed to update actions";
            case 5:
                return "Error while getting new data";
            case 6:
                return new ldc(ldc.b);
            case 7:
                return new ldc(ldc.b);
            case 8:
                return "Problem during commit data";
            case 9:
                return "Error while getting new data";
            case 10:
                return "Error during UserFeedbackRepository emit value";
            case 11:
                return "Failed to receive bottomSheet Y offset";
            case 12:
                return "Failed to handle ETA updates";
            case 13:
                return "Failed to handle hint message updates";
            case 14:
                return "Failed to handle long search info update";
            case 15:
                return "Failed to handle states update";
            case 16:
                return "Failed to handle radius update";
            case 17:
                return "Error while handling taxiOnTheWayData";
            case 18:
                return "Error while fetching route progress from RouteProgressTracker";
            case 19:
                return "error update totw titles";
            case 20:
                return "error subscribe to order status provider";
            case 21:
                return new ldc(ldc.b);
            case 22:
                return "Error while getting new data";
            case 23:
                return zy11.a;
            case 24:
                return "Error while getting new data";
            case 25:
                return "SUPPORT_FLOW_LOADING_ERROR: SupportItems is null";
            case 26:
                return "Failed to update messages";
            case 27:
                return "Failed to update order";
            case 28:
                return "Failed to create TaxiOrderModel";
            default:
                return "can't process order update";
        }
    }
}
