package xsna;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.view.View;
import androidx.annotation.NonNull;
import com.unity3d.services.UnityAdsConstants;
import com.vk.im.engine.models.dialogs.Dialog;
import com.vk.imageloader.view.VKImageView;
import kotlin.LazyThreadSafetyMode;
import org.xmlpull.v1.XmlPullParser;
import xsna.b4;
import xsna.npf;

/* compiled from: ViewOverlayApi18.java */
/* loaded from: classes13.dex */
public final class ezt0 implements c4, z1y0, ppf, ws01 {
    public final Object b;

    public /* synthetic */ ezt0(Object obj) {
        this.b = obj;
    }

    public boolean a() {
        q7r q7rVar = ((plm0) ((hri0) this.b).c).a().a;
        Bitmap currentBitmap = q7rVar.j0.getCurrentBitmap();
        if (currentBitmap == null) {
            return false;
        }
        VKImageView vKImageView = q7rVar.x;
        if (vKImageView == null) {
            return true;
        }
        vKImageView.setPlaceholderImage(new BitmapDrawable(vKImageView.getContext().getResources(), currentBitmap));
        return true;
    }

    @Override // xsna.c4
    public void d(b4 b4Var) {
        if (b4Var instanceof b4.g) {
            ((gkc0) this.b).invoke();
        }
    }

    @Override // xsna.ppf
    public npf h() {
        return (npf.h.j) this.b;
    }

    @Override // xsna.z1y0
    public void i() {
        oob oobVar = (oob) this.b;
        mxv mxvVar = oobVar.c;
        if (!oobVar.L && !oobVar.E().e()) {
            oobVar.L = true;
            Dialog Cb = oobVar.l.Cb();
            fnv0 fnv0Var = fnv0.a;
            if (Cb == null || !Cb.vc()) {
                mxvVar.getClass();
                fnv0Var.h();
            } else {
                mxvVar.getClass();
                fnv0Var.f(oobVar.f);
            }
        }
        int i = ify.a;
        if (ify.e(ify.c)) {
            tob tobVar = oobVar.z;
            (tobVar != null ? tobVar : null).getClass();
            oobVar.M = true;
        } else {
            tob tobVar2 = oobVar.z;
            (tobVar2 != null ? tobVar2 : null).e(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        }
        oobVar.E().k();
    }

    @Override // xsna.ws01
    public void zza() {
        ytz0 ytz0Var = (ytz0) this.b;
        int i = 0;
        while (true) {
            XmlPullParser xmlPullParser = ytz0Var.a;
            if (i >= xmlPullParser.getAttributeCount()) {
                ytz0Var.b("split-install-error", new vou(ytz0Var));
                return;
            }
            if ("defaultErrorCode".equals(xmlPullParser.getAttributeName(i))) {
                ktz0 ktz0Var = ytz0Var.b;
                String attributeValue = xmlPullParser.getAttributeValue(i);
                Integer num = (Integer) jtz0.c.get(attributeValue);
                if (num == null) {
                    throw new IllegalArgumentException(String.valueOf(attributeValue).concat(" is unknown error."));
                }
                ktz0Var.c = num;
            }
            i++;
        }
    }

    public ezt0() {
        this.b = msy.a(LazyThreadSafetyMode.NONE, new x0(29));
    }

    public ezt0(@NonNull View view) {
        this.b = view.getOverlay();
    }

    @Override // xsna.z1y0
    public void f() {
    }

    @Override // xsna.z1y0
    public void g() {
    }
}
