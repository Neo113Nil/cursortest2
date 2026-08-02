package xsna;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import com.unity3d.services.UnityAdsConstants;
import java.util.List;
import kotlin.Pair;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes17.dex */
public final /* synthetic */ class bix implements wzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;

    public /* synthetic */ bix(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f = obj4;
        this.g = obj5;
    }

    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        TypedArray obtainAttributes;
        ckr0 ckr0Var;
        switch (this.b) {
            case 0:
                fw20 fw20Var = (fw20) this.c;
                q630 q630Var = (q630) this.d;
                wzs wzsVar = (wzs) this.e;
                wzs wzsVar2 = (wzs) this.f;
                jai jaiVar = (jai) this.g;
                androidx.compose.runtime.a aVar = (androidx.compose.runtime.a) obj;
                int intValue = ((Integer) obj2).intValue();
                if (aVar.t(intValue & 1, (intValue & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-1554549529, intValue, -1, "com.vk.core.compose.component.internal.SheetSurface.<anonymous> (InternalModalBottomSheet.kt:280)");
                    }
                    nix.f(fw20Var, q630Var, wzsVar, wzsVar2, jaiVar, aVar, 0);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar.h();
                }
                return s3q0.a;
            default:
                XmlResourceParser xmlResourceParser = (XmlResourceParser) this.c;
                Resources resources = (Resources) this.d;
                Resources.Theme theme = (Resources.Theme) this.e;
                AttributeSet attributeSet = (AttributeSet) this.f;
                huo huoVar = (huo) this.g;
                ckr0 ckr0Var2 = (ckr0) obj;
                List list = (List) obj2;
                ckr0 ckr0Var3 = i4y0.a;
                xmlResourceParser.next();
                ckr0 ckr0Var4 = null;
                while (!j4y0.a(xmlResourceParser) && (xmlResourceParser.getEventType() != 3 || !epx.f(xmlResourceParser.getName(), "propertyValuesHolder"))) {
                    if (xmlResourceParser.getEventType() == 2 && epx.f(xmlResourceParser.getName(), "keyframe")) {
                        int[] iArr = d02.g;
                        if (theme == null || (obtainAttributes = theme.obtainStyledAttributes(attributeSet, iArr, 0, 0)) == null) {
                            obtainAttributes = resources.obtainAttributes(attributeSet, iArr);
                        }
                        if (ckr0Var2 == null) {
                            try {
                                ckr0Var = i4y0.d(obtainAttributes.getInt(2, 4), obtainAttributes.peekValue(0).type);
                                if (ckr0Var == null) {
                                    ckr0Var = ckr0Var3;
                                }
                            } catch (Throwable th) {
                                obtainAttributes.recycle();
                                throw th;
                            }
                        } else {
                            ckr0Var = ckr0Var2;
                        }
                        Pair pair = new Pair(i4y0.b(obtainAttributes, obtainAttributes.getFloat(3, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT), i4y0.a(obtainAttributes, resources, theme, 1, huoVar), ckr0Var, 0), ckr0Var);
                        obtainAttributes.recycle();
                        ohy ohyVar = (ohy) pair.d();
                        ckr0 ckr0Var5 = (ckr0) pair.g();
                        if (ckr0Var4 == null) {
                            ckr0Var4 = ckr0Var5;
                        }
                        list.add(ohyVar);
                    }
                    xmlResourceParser.next();
                }
                return ckr0Var4 == null ? ckr0Var2 == null ? ckr0Var3 : ckr0Var2 : ckr0Var4;
        }
    }
}
