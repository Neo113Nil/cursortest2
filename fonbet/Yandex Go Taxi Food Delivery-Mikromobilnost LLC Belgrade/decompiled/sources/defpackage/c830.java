package defpackage;

import com.yandex.go.morphlex.api.MorphlexScreenPayload$ParamType;
import com.yandex.go.morphlex.api.MorphlexScreenPayload$PresentType;
import com.yandex.go.morphlex.data.dto.MorphlexInstruction;
import com.yandex.go.morphlex.data.dto.MorphlexScreenPresentType;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes12.dex */
public abstract class c830 {
    public static ArrayList a(List list) {
        MorphlexScreenPayload$ParamType morphlexScreenPayload$ParamType;
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            MorphlexInstruction morphlexInstruction = (MorphlexInstruction) it.next();
            switch (b830.b[morphlexInstruction.a.ordinal()]) {
                case 1:
                    morphlexScreenPayload$ParamType = MorphlexScreenPayload$ParamType.AUTH;
                    break;
                case 2:
                    morphlexScreenPayload$ParamType = MorphlexScreenPayload$ParamType.GEO;
                    break;
                case 3:
                    morphlexScreenPayload$ParamType = MorphlexScreenPayload$ParamType.POINT_A;
                    break;
                case 4:
                    morphlexScreenPayload$ParamType = MorphlexScreenPayload$ParamType.ORDERS;
                    break;
                case 5:
                    morphlexScreenPayload$ParamType = MorphlexScreenPayload$ParamType.SYSTEM_SOUND_IS_MUTED;
                    break;
                case 6:
                    morphlexScreenPayload$ParamType = MorphlexScreenPayload$ParamType.PAYMENT_METHOD;
                    break;
                case 7:
                    morphlexScreenPayload$ParamType = MorphlexScreenPayload$ParamType.TARIFF_CLASS;
                    break;
                case 8:
                    morphlexScreenPayload$ParamType = MorphlexScreenPayload$ParamType.PREORDER_DUE;
                    break;
                case 9:
                    morphlexScreenPayload$ParamType = MorphlexScreenPayload$ParamType.ADDITIONAL_PREORDER_INFO;
                    break;
                case 10:
                    morphlexScreenPayload$ParamType = MorphlexScreenPayload$ParamType.TARIFF_REQUIREMENTS;
                    break;
                case 11:
                    morphlexScreenPayload$ParamType = MorphlexScreenPayload$ParamType.ORDER_COMMENT;
                    break;
                case 12:
                    morphlexScreenPayload$ParamType = MorphlexScreenPayload$ParamType.ROUTE;
                    break;
                case 13:
                    morphlexScreenPayload$ParamType = null;
                    break;
                default:
                    w511.b();
                    return null;
            }
            g830 g830Var = morphlexScreenPayload$ParamType != null ? new g830(morphlexScreenPayload$ParamType, morphlexInstruction.b) : null;
            if (g830Var != null) {
                arrayList.add(g830Var);
            }
        }
        return arrayList;
    }

    public static MorphlexScreenPayload$PresentType b(MorphlexScreenPresentType morphlexScreenPresentType) {
        int i = b830.a[morphlexScreenPresentType.ordinal()];
        if (i == 1) {
            return MorphlexScreenPayload$PresentType.FULLSCREEN;
        }
        if (i == 2) {
            return MorphlexScreenPayload$PresentType.CARD;
        }
        if (i == 3) {
            return MorphlexScreenPayload$PresentType.POPUP;
        }
        if (i == 4) {
            return null;
        }
        w511.b();
        return null;
    }
}
