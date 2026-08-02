package xsna;

import android.content.Context;
import android.util.AttributeSet;
import android.view.KeyEvent;
import com.vk.dto.stories.model.mention.SelectionChangeEditText;

/* compiled from: BackPressEditText.java */
@Deprecated
/* loaded from: classes7.dex */
public class hv5 extends SelectionChangeEditText {
    public a c;

    /* compiled from: BackPressEditText.java */
    public interface a {
    }

    public hv5(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public a getCallback() {
        return this.c;
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean onKeyPreIme(int i, KeyEvent keyEvent) {
        a aVar;
        if (i != 4 || keyEvent.getAction() != 1 || (aVar = this.c) == null) {
            return super.onKeyPreIme(i, keyEvent);
        }
        ((cmo0) ((did0) aVar).c).d();
        return true;
    }

    public void setCallback(a aVar) {
        this.c = aVar;
    }
}
