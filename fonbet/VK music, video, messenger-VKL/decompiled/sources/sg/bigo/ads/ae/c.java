package sg.bigo.ads.ae;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.annotation.NonNull;
import sg.bigo.ads.R;

/* loaded from: classes9.dex */
public final class c extends Dialog {
    private a a;

    public interface a {
        void a();

        void b();

        void c();

        void d();
    }

    public c(@NonNull Context context) {
        super(context, R.style.BigoAd_Dialog_Fullscreen);
        setCanceledOnTouchOutside(true);
    }

    @Override // android.app.Dialog
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        View a2 = sg.bigo.ads.common.utils.a.a(getContext(), R.layout.bigo_ad_dialog_reward_retain, null, false);
        setContentView(a2);
        a2.setOnClickListener(new View.OnClickListener() { // from class: sg.bigo.ads.ae.c.1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                c.this.dismiss();
            }
        });
        a2.findViewById(R.id.bigo_ad_btn_resume).setOnClickListener(new View.OnClickListener() { // from class: sg.bigo.ads.ae.c.2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                if (c.this.a != null) {
                    c.this.a.d();
                }
                c.this.dismiss();
            }
        });
        a2.findViewById(R.id.bigo_ad_btn_skip).setOnClickListener(new View.OnClickListener() { // from class: sg.bigo.ads.ae.c.3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                if (c.this.a != null) {
                    c.this.a.c();
                }
                c.this.dismiss();
            }
        });
    }

    @Override // android.app.Dialog
    public final void onStart() {
        super.onStart();
        a aVar = this.a;
        if (aVar != null) {
            aVar.a();
        }
    }

    @Override // android.app.Dialog
    public final void onStop() {
        super.onStop();
        a aVar = this.a;
        if (aVar != null) {
            aVar.b();
            this.a = null;
        }
    }

    public final void a(a aVar) {
        this.a = aVar;
        getWindow().setFlags(8, 8);
        show();
        getWindow().getDecorView().setSystemUiVisibility(5894);
        getWindow().clearFlags(8);
    }
}
