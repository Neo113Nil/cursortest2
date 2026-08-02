package defpackage;

import android.widget.CompoundButton;
import com.yandex.div.internal.widget.SwitchView;

/* loaded from: classes2.dex */
public final /* synthetic */ class ojb implements CompoundButton.OnCheckedChangeListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ tls b;

    public /* synthetic */ ojb(int i, tls tlsVar) {
        this.a = i;
        this.b = tlsVar;
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        int i = this.a;
        tls tlsVar = this.b;
        switch (i) {
            case 0:
                tlsVar.invoke(Boolean.valueOf(z));
                break;
            case 1:
                SwitchView.setOnCheckedChangeListener$lambda$2(tlsVar, compoundButton, z);
                break;
            default:
                tlsVar.invoke(Boolean.valueOf(z));
                break;
        }
    }
}
