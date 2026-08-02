package defpackage;

import com.yandex.go.sql.BaseDatabaseHelper;
import kotlin.Result;
import kotlinx.serialization.json.b;

/* loaded from: classes2.dex */
public final class i260 extends dcx {
    public static final i260 d = new i260(qoi0.a(h260.class));

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    @Override // defpackage.dcx
    public final myi c(b bVar) {
        Object failure;
        try {
            b bVar2 = (b) qcx.m(bVar).get("type");
            failure = bVar2 != null ? qcx.n(bVar2).a() : null;
        } catch (Throwable th) {
            failure = new Result.Failure(th);
        }
        if (failure == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        if (Result.a(failure) != null) {
            yhl.d(bVar, "Invalid discriminator for element=");
            return null;
        }
        String str = (String) failure;
        switch (str.hashCode()) {
            case -1842863060:
                if (str.equals("SPACER")) {
                    return r060.Companion.serializer();
                }
                break;
            case -1836143820:
                if (str.equals("SWITCH")) {
                    return l160.Companion.serializer();
                }
                break;
            case 2571565:
                if (str.equals(BaseDatabaseHelper.TYPE_TEXT)) {
                    return r160.Companion.serializer();
                }
                break;
            case 69775675:
                if (str.equals("IMAGE")) {
                    return iv50.Companion.serializer();
                }
                break;
            case 493958859:
                if (str.equals("BOX_GROUP")) {
                    return cp50.Companion.serializer();
                }
                break;
            case 1546011220:
                if (str.equals("LINE_GROUP")) {
                    return hw50.Companion.serializer();
                }
                break;
            case 1970608946:
                if (str.equals("BUTTON")) {
                    return fp50.Companion.serializer();
                }
                break;
        }
        w511.j("Can't find discriminator=", str, " for NetworkWidgetModel");
        return null;
    }
}
