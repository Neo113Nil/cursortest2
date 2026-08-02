package xsna;

import android.content.Context;
import android.os.Handler;
import androidx.appcompat.widget.AppCompatTextView;
import com.vkontakte.android.R;
import java.util.UUID;

/* compiled from: ControlDescriptionTextView.kt */
/* loaded from: classes3.dex */
public final class cqj extends AppCompatTextView {
    public final String b;

    public cqj(Context context) {
        super(context);
        this.b = UUID.randomUUID().toString();
        setGravity(1);
        f4m.y(iah0.a(46), this);
        f4m.x(iah0.a(12), this);
        qcy<Object>[] qcyVarArr = bwt0.a;
        setTextAppearance(R.style.VideoControlMessage);
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        if (getHandler() == null) {
            return;
        }
        Handler handler = getHandler();
        String str = this.b;
        handler.removeCallbacksAndMessages(str);
        if (i == 0) {
            getHandler().postDelayed(new wk(this, 7), str, 5000L);
        }
    }
}
