package defpackage;

import android.app.Activity;
import com.yandex.go.lootbox.impl.presentation.detail.LootBoxDetailDialog;

/* loaded from: classes12.dex */
public final class bqz {
    public final Activity a;
    public final zpz b;

    public bqz(Activity activity, zpz zpzVar) {
        this.a = activity;
        this.b = zpzVar;
    }

    public final void a(uoz uozVar) {
        gus gusVar = this.b.a;
        new LootBoxDetailDialog(this.a, uozVar, (k7x0) gusVar.a.get(), (pav) gusVar.b.get()).show();
    }
}
