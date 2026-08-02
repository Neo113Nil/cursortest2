package xsna;

import android.R;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.GoogleApiAvailability;
import java.util.LinkedList;
import xsna.l4z;

/* compiled from: com.google.android.gms:play-services-base@@18.10.0 */
/* loaded from: classes12.dex */
public abstract class esl<T extends l4z> {
    public l4z a;

    @Nullable
    public Bundle b;
    public LinkedList c;
    public final h6o0 d = new h6o0(this);

    public static void b(@NonNull FrameLayout frameLayout) {
        GoogleApiAvailability googleApiAvailability = GoogleApiAvailability.getInstance();
        Context context = frameLayout.getContext();
        int isGooglePlayServicesAvailable = googleApiAvailability.isGooglePlayServicesAvailable(context);
        String c = coz0.c(isGooglePlayServicesAvailable, context);
        String e = coz0.e(isGooglePlayServicesAvailable, context);
        LinearLayout linearLayout = new LinearLayout(frameLayout.getContext());
        linearLayout.setOrientation(1);
        linearLayout.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
        frameLayout.addView(linearLayout);
        TextView textView = new TextView(frameLayout.getContext());
        textView.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
        textView.setText(c);
        linearLayout.addView(textView);
        Intent b = googleApiAvailability.b(context, isGooglePlayServicesAvailable, null);
        if (b != null) {
            Button button = new Button(context);
            button.setId(R.id.button1);
            button.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
            button.setText(e);
            linearLayout.addView(button);
            button.setOnClickListener(new ynz0(context, b));
        }
    }

    public abstract void a(@NonNull h6o0 h6o0Var);

    public final void c(int i) {
        while (!this.c.isEmpty() && ((loz0) this.c.getLast()).m() >= i) {
            this.c.removeLast();
        }
    }

    public final void d(@Nullable Bundle bundle, loz0 loz0Var) {
        if (this.a != null) {
            loz0Var.a();
            return;
        }
        if (this.c == null) {
            this.c = new LinkedList();
        }
        this.c.add(loz0Var);
        if (bundle != null) {
            Bundle bundle2 = this.b;
            if (bundle2 == null) {
                this.b = (Bundle) bundle.clone();
            } else {
                bundle2.putAll(bundle);
            }
        }
        a(this.d);
    }
}
