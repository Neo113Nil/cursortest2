package xsna;

import android.R;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.util.Xml;
import android.view.animation.BounceInterpolator;
import java.util.HashMap;
import kotlin.Pair;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: AnimatorResources.android.kt */
/* loaded from: classes11.dex */
public final class lr2 {
    public static final fr2 a = new fr2();
    public static final gr2 b = new gr2();
    public static final cr2 c = new cr2(new BounceInterpolator());
    public static final hr2 d = new hr2();
    public static final HashMap<Integer, huo> e;

    static {
        Integer valueOf = Integer.valueOf(R.anim.linear_interpolator);
        kuo kuoVar = luo.d;
        Pair pair = new Pair(valueOf, kuoVar);
        Integer valueOf2 = Integer.valueOf(R.interpolator.fast_out_linear_in);
        nkk nkkVar = luo.c;
        Pair pair2 = new Pair(valueOf2, nkkVar);
        Integer valueOf3 = Integer.valueOf(R.interpolator.fast_out_slow_in);
        nkk nkkVar2 = luo.a;
        Pair pair3 = new Pair(valueOf3, nkkVar2);
        Pair pair4 = new Pair(Integer.valueOf(R.interpolator.linear), kuoVar);
        Integer valueOf4 = Integer.valueOf(R.interpolator.linear_out_slow_in);
        nkk nkkVar3 = luo.b;
        e = pn00.i(pair, pair2, pair3, pair4, new Pair(valueOf4, nkkVar3), new Pair(valueOf2, nkkVar), new Pair(valueOf3, nkkVar2), new Pair(valueOf4, nkkVar3));
    }

    public static final ar2 a(int i, Resources.Theme theme, Resources resources) throws XmlPullParserException {
        XmlResourceParser xml = resources.getXml(i);
        AttributeSet asAttributeSet = Xml.asAttributeSet(xml);
        j4y0.b(xml);
        String name = xml.getName();
        if (epx.f(name, "set")) {
            return i4y0.e(xml, resources, theme, asAttributeSet);
        }
        if (epx.f(name, "objectAnimator")) {
            return i4y0.f(xml, resources, theme, asAttributeSet);
        }
        throw new XmlPullParserException("Unknown tag: " + xml.getName());
    }
}
