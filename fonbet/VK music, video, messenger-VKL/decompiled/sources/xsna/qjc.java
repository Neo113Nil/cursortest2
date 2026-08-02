package xsna;

import android.graphics.Typeface;
import android.os.Bundle;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import com.vk.common.links.AwayLink;
import com.vkontakte.android.R;

/* compiled from: ClickableLinkSpan.kt */
/* loaded from: classes17.dex */
public abstract class qjc extends CharacterStyle implements rku0, l2v0, Cloneable {
    public static final /* synthetic */ int h = 0;
    public a c;
    public final AwayLink d;
    public wxk0 f;
    public Typeface g;
    public boolean b = true;
    public final apo e = new apo(R.attr.vk_ui_text_link);

    /* compiled from: ClickableLinkSpan.kt */
    public interface a {
        void I(AwayLink awayLink);
    }

    public qjc(a aVar) {
        this.c = aVar;
        d(false);
        this.d = null;
    }

    public final void b(int i) {
        apo apoVar = this.e;
        apoVar.a = i;
        apoVar.d = krv0.m(i, apoVar.b());
    }

    public final void c(int i) {
        this.f = new wxk0(i);
    }

    public final Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public void d(boolean z) {
        this.b = z;
    }

    public boolean e() {
        return this.b;
    }

    public final void g(boolean z) {
        this.e.c(z);
    }

    public int getColor() {
        wxk0 wxk0Var = this.f;
        return wxk0Var != null ? wxk0Var.a : this.e.a();
    }

    @Override // xsna.l2v0
    public final String i() {
        AwayLink awayLink = this.d;
        if (awayLink != null) {
            return awayLink.b;
        }
        return null;
    }

    public void j() {
        this.g = null;
    }

    @Override // android.text.style.CharacterStyle
    public void updateDrawState(TextPaint textPaint) {
        textPaint.setColor(getColor());
        Typeface typeface = this.g;
        if (typeface != null) {
            textPaint.setTypeface(typeface);
        }
    }

    public qjc(String str, Bundle bundle) {
        this.d = new AwayLink(str, bundle);
    }
}
