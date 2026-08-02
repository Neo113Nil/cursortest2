package xsna;

import androidx.credentials.playservices.controllers.CredentialProviderBaseController;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: OneVideoStoryCacheKeyFactory.kt */
/* loaded from: classes.dex */
public final class qn80 {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ qn80[] $VALUES;
    public static final qn80 CONTENT_TYPE;
    public static final qn80 FN;
    public static final qn80 ID;
    public static final qn80 MDCT;
    public static final qn80 MID;
    public static final qn80 TID;
    public static final qn80 TYPE;
    public static final qn80 VIDEO;
    private final String key;

    static {
        qn80 qn80Var = new qn80("ID", 0, "id");
        ID = qn80Var;
        qn80 qn80Var2 = new qn80(CredentialProviderBaseController.TYPE_TAG, 1, "type");
        TYPE = qn80Var2;
        qn80 qn80Var3 = new qn80("CONTENT_TYPE", 2, "ct");
        CONTENT_TYPE = qn80Var3;
        qn80 qn80Var4 = new qn80("MID", 3, "mid");
        MID = qn80Var4;
        qn80 qn80Var5 = new qn80("TID", 4, "tid");
        TID = qn80Var5;
        qn80 qn80Var6 = new qn80("FN", 5, "fn");
        FN = qn80Var6;
        qn80 qn80Var7 = new qn80(SignalingProtocol.MEDIA_OPTION_VIDEO, 6, "video");
        VIDEO = qn80Var7;
        qn80 qn80Var8 = new qn80("MDCT", 7, "mdct");
        MDCT = qn80Var8;
        qn80[] qn80VarArr = {qn80Var, qn80Var2, qn80Var3, qn80Var4, qn80Var5, qn80Var6, qn80Var7, qn80Var8};
        $VALUES = qn80VarArr;
        $ENTRIES = new asp(qn80VarArr);
    }

    public qn80(String str, int i, String str2) {
        this.key = str2;
    }

    public static zrp<qn80> h() {
        return $ENTRIES;
    }

    public static qn80 valueOf(String str) {
        return (qn80) Enum.valueOf(qn80.class, str);
    }

    public static qn80[] values() {
        return (qn80[]) $VALUES.clone();
    }

    public final String i() {
        return this.key;
    }
}
