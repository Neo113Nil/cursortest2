package defpackage;

import android.animation.ValueAnimator;
import android.graphics.PointF;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.widget.ImageView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.tasks.Task;
import com.yandex.go.shortcuts.impl.view.adapter.n;
import com.yandex.go.suggest.impl.view.FullscreenSuperappSuggestModalView;
import com.yandex.mapkit.map.IconStyle;
import com.yandex.mapkit.map.Rect;
import com.yandex.messaging.internal.ChatAlias;
import com.yandex.messaging.internal.CreateChannel;
import com.yandex.messaging.internal.CreateFamilyChat;
import com.yandex.messaging.internal.CreateGroupChat;
import com.yandex.messaging.internal.ExistingChat;
import com.yandex.messaging.internal.InviteChat;
import com.yandex.messaging.internal.InviteThread;
import com.yandex.messaging.internal.PrivateChat;
import com.yandex.messaging.internal.StaffChat;
import com.yandex.messaging.internal.ThreadChat;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.List;
import kotlin.collections.EmptyList;
import org.xmlpull.v1.XmlPullParser;
import ru.CryptoPro.JCP.JCP;
import ru.yandex.taxi.search.address.view.PointType;

/* loaded from: classes13.dex */
public final class egz implements tgz, l8b, m7j0, w7p, dgq0, aax0, ca01, zc81, h3v0 {
    public egz(FullscreenSuperappSuggestModalView fullscreenSuperappSuggestModalView) {
        fullscreenSuperappSuggestModalView.setFloatingInputTrailVisibility(0);
        fullscreenSuperappSuggestModalView.setFloatingInputTrailEnabled(true);
    }

    public static cj61 A(XmlPullParser xmlPullParser) {
        xmlPullParser.require(2, null, "Extension");
        String attributeValue = xmlPullParser.getAttributeValue(null, "type");
        String a = xf81.a(xmlPullParser);
        if (attributeValue == null || attributeValue.length() == 0 || a.length() <= 0) {
            return null;
        }
        return new cj61(attributeValue, a);
    }

    public static final ValueAnimator B(ImageView imageView, float f, float f2) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f, f2);
        ofFloat.setDuration(150L);
        ofFloat.addUpdateListener(new wd2(imageView, 9));
        ofFloat.setInterpolator(f > f2 ? new AccelerateInterpolator() : new DecelerateInterpolator());
        return ofFloat;
    }

    public static final int C(RecyclerView recyclerView, LinearLayoutManager linearLayoutManager) {
        int min;
        List list = n.e0;
        int K1 = linearLayoutManager.K1();
        int M1 = linearLayoutManager.M1();
        if (K1 > M1) {
            return K1;
        }
        int i = K1;
        int i2 = 0;
        while (true) {
            View X = linearLayoutManager.X(K1);
            if (X != null && (min = Math.min(X.getBottom(), recyclerView.getHeight()) - Math.max(X.getTop(), 0)) > i2) {
                i = K1;
                i2 = min;
            }
            if (K1 == M1) {
                return i;
            }
            K1++;
        }
    }

    public static final boolean D(IconStyle iconStyle, IconStyle iconStyle2) {
        PointF max;
        Rect tappableArea;
        PointF max2;
        PointF min;
        Rect tappableArea2;
        PointF min2;
        PointF max3;
        Rect tappableArea3;
        PointF max4;
        PointF min3;
        Rect tappableArea4;
        PointF min4;
        PointF anchor;
        PointF anchor2;
        Float valueOf = (iconStyle == null || (anchor2 = iconStyle.getAnchor()) == null) ? null : Float.valueOf(anchor2.x);
        PointF anchor3 = iconStyle2.getAnchor();
        if (!jl40.k(valueOf, anchor3 != null ? Float.valueOf(anchor3.x) : null)) {
            return false;
        }
        Float valueOf2 = (iconStyle == null || (anchor = iconStyle.getAnchor()) == null) ? null : Float.valueOf(anchor.y);
        PointF anchor4 = iconStyle2.getAnchor();
        if (!jl40.k(valueOf2, anchor4 != null ? Float.valueOf(anchor4.y) : null)) {
            return false;
        }
        if (!jl40.l(iconStyle != null ? iconStyle.getFlat() : null, iconStyle2.getFlat())) {
            return false;
        }
        if (!jl40.l(iconStyle != null ? iconStyle.getVisible() : null, iconStyle2.getVisible())) {
            return false;
        }
        Float valueOf3 = (iconStyle == null || (tappableArea4 = iconStyle.getTappableArea()) == null || (min4 = tappableArea4.getMin()) == null) ? null : Float.valueOf(min4.x);
        Rect tappableArea5 = iconStyle2.getTappableArea();
        if (!jl40.k(valueOf3, (tappableArea5 == null || (min3 = tappableArea5.getMin()) == null) ? null : Float.valueOf(min3.x))) {
            return false;
        }
        Float valueOf4 = (iconStyle == null || (tappableArea3 = iconStyle.getTappableArea()) == null || (max4 = tappableArea3.getMax()) == null) ? null : Float.valueOf(max4.x);
        Rect tappableArea6 = iconStyle2.getTappableArea();
        if (!jl40.k(valueOf4, (tappableArea6 == null || (max3 = tappableArea6.getMax()) == null) ? null : Float.valueOf(max3.x))) {
            return false;
        }
        Float valueOf5 = (iconStyle == null || (tappableArea2 = iconStyle.getTappableArea()) == null || (min2 = tappableArea2.getMin()) == null) ? null : Float.valueOf(min2.y);
        Rect tappableArea7 = iconStyle2.getTappableArea();
        if (!jl40.k(valueOf5, (tappableArea7 == null || (min = tappableArea7.getMin()) == null) ? null : Float.valueOf(min.y))) {
            return false;
        }
        Float valueOf6 = (iconStyle == null || (tappableArea = iconStyle.getTappableArea()) == null || (max2 = tappableArea.getMax()) == null) ? null : Float.valueOf(max2.y);
        Rect tappableArea8 = iconStyle2.getTappableArea();
        if (!jl40.k(valueOf6, (tappableArea8 == null || (max = tappableArea8.getMax()) == null) ? null : Float.valueOf(max.y))) {
            return false;
        }
        if (!jl40.k(iconStyle != null ? iconStyle.getZIndex() : null, iconStyle2.getZIndex())) {
            return false;
        }
        if (jl40.k(iconStyle != null ? iconStyle.getScale() : null, iconStyle2.getScale())) {
            return (iconStyle != null ? iconStyle.getRotationType() : null) == iconStyle2.getRotationType();
        }
        return false;
    }

    public static final ValueAnimator E(ImageView imageView, int i, int i2) {
        ValueAnimator ofInt = ValueAnimator.ofInt(i, i2);
        ofInt.setDuration(150L);
        ofInt.addUpdateListener(new wd2(imageView, 10));
        ofInt.setInterpolator(i > i2 ? new AccelerateInterpolator() : new DecelerateInterpolator());
        return ofInt;
    }

    public static k9s0 F(bov0 bov0Var) {
        return new k9s0(new fcj0(bov0Var));
    }

    public static k9s0 G(boolean z, khv0 khv0Var, ijv0 ijv0Var) {
        return new k9s0(new fcj0(new bov0(z, khv0Var, ijv0Var, 8)));
    }

    public static /* synthetic */ k9s0 H(ehv0 ehv0Var, ijv0 ijv0Var, int i) {
        khv0 khv0Var = ehv0Var;
        if ((i & 2) != 0) {
            khv0Var = new bhv0(0);
        }
        if ((i & 4) != 0) {
            ijv0Var = null;
        }
        return G(true, khv0Var, ijv0Var);
    }

    @Override // defpackage.aax0
    public PointType a() {
        return null;
    }

    @Override // defpackage.aax0
    public boolean b() {
        return false;
    }

    @Override // defpackage.k8b
    public /* bridge */ /* synthetic */ Object c(ExistingChat existingChat) {
        return Boolean.TRUE;
    }

    @Override // defpackage.w7p
    public Object create() {
        try {
            return new zol0(MessageDigest.getInstance(JCP.DIGEST_SHA_256));
        } catch (NoSuchAlgorithmException e) {
            ny61.j(e);
            return null;
        }
    }

    @Override // defpackage.aax0
    public boolean d() {
        return false;
    }

    @Override // defpackage.dgq0
    public List e() {
        return EmptyList.a;
    }

    @Override // defpackage.zc81
    public /* bridge */ /* synthetic */ Object f(XmlPullParser xmlPullParser, zy2 zy2Var) {
        return A(xmlPullParser);
    }

    @Override // defpackage.h3v0
    public Task g(Object obj) {
        return udq0.p((List) obj);
    }

    @Override // defpackage.ca01
    public void h(String str) {
    }

    @Override // defpackage.aax0
    public void i(zzs zzsVar) {
    }

    @Override // defpackage.k8b
    public /* bridge */ /* synthetic */ Object j(CreateChannel createChannel) {
        return Boolean.FALSE;
    }

    @Override // defpackage.k8b
    public /* bridge */ /* synthetic */ Object k(InviteThread inviteThread) {
        return Boolean.FALSE;
    }

    @Override // defpackage.aax0
    public void l() {
    }

    @Override // defpackage.k8b
    public /* bridge */ /* synthetic */ Object m(InviteChat inviteChat) {
        return Boolean.TRUE;
    }

    @Override // defpackage.k8b
    public /* bridge */ /* synthetic */ Object n(StaffChat staffChat) {
        return Boolean.TRUE;
    }

    @Override // defpackage.aax0
    public boolean o() {
        return false;
    }

    @Override // defpackage.k8b
    public /* bridge */ /* synthetic */ Object p(ChatAlias chatAlias) {
        return Boolean.FALSE;
    }

    @Override // defpackage.aax0
    public void q(zzs zzsVar) {
    }

    @Override // defpackage.tgz
    public void r(String str) {
    }

    @Override // defpackage.tgz
    public void s(Exception exc, String str) {
    }

    @Override // defpackage.k8b
    public /* bridge */ /* synthetic */ Object t(ThreadChat threadChat) {
        return Boolean.TRUE;
    }

    @Override // defpackage.k8b
    public /* bridge */ /* synthetic */ Object u(CreateFamilyChat createFamilyChat) {
        return Boolean.FALSE;
    }

    @Override // defpackage.k8b
    public /* bridge */ /* synthetic */ Object v() {
        return Boolean.TRUE;
    }

    @Override // defpackage.k8b
    public /* bridge */ /* synthetic */ Object w(CreateGroupChat createGroupChat) {
        return Boolean.FALSE;
    }

    @Override // defpackage.dgq0
    public void x(String str) {
    }

    @Override // defpackage.aax0
    public void y() {
    }

    @Override // defpackage.k8b
    public /* bridge */ /* synthetic */ Object z(PrivateChat privateChat) {
        return Boolean.TRUE;
    }

    public /* synthetic */ egz(i3a1 i3a1Var, int i, int i2) {
    }

    public egz() {
    }
}
