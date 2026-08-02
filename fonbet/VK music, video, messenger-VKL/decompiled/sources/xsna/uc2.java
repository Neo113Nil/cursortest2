package xsna;

import android.R;
import android.app.ActivityOptions;
import android.app.PendingIntent;
import android.app.RemoteAction;
import android.content.Context;
import android.os.Build;
import android.util.Log;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.textclassifier.TextClassification;
import androidx.compose.foundation.MutatePriority;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: AndroidTextContextMenuToolbarProvider.android.kt */
/* loaded from: classes11.dex */
public final class uc2 implements gdo0 {
    public final View a;
    public final izs<nbo0, nbo0> b;
    public final gzs<tny> c;
    public final ni50 d = new ni50();
    public final ibk0 e = new ibk0(new p40(this, 3));
    public final r9 f = new r9(this, 2);
    public final s9 g = new s9(this, 3);
    public ActionMode h;
    public vc2 i;
    public Runnable j;

    /* compiled from: AndroidTextContextMenuToolbarProvider.android.kt */
    public static final class a implements nbo0 {
        public final b a;
        public final com.vk.movika.sdk.base.ui.k b;
        public final com.vk.movika.sdk.base.ui.l c;
        public final View d;

        public a(b bVar, com.vk.movika.sdk.base.ui.k kVar, com.vk.movika.sdk.base.ui.l lVar, View view) {
            this.a = bVar;
            this.b = kVar;
            this.c = lVar;
            this.d = view;
        }

        @Override // xsna.nbo0
        public final boolean a(Menu menu) {
            e(menu);
            return menu.size() > 0;
        }

        @Override // xsna.nbo0
        public final zhf0 b() {
            return (zhf0) this.c.invoke();
        }

        @Override // xsna.nbo0
        public final boolean c(Menu menu) {
            return e(menu);
        }

        @Override // xsna.nbo0
        public final void d() {
            this.a.close();
        }

        public final boolean e(Menu menu) {
            int i;
            vco0 vco0Var = (vco0) this.b.invoke();
            int i2 = 0;
            if (epx.f(vco0Var, null)) {
                return false;
            }
            menu.clear();
            List<uco0> list = vco0Var.a;
            int size = list.size();
            int i3 = 0;
            int i4 = 1;
            int i5 = 1;
            while (i3 < size) {
                uco0 uco0Var = list.get(i3);
                if (uco0Var instanceof edo0) {
                    i = i4 + 1;
                    Object obj = uco0Var.a;
                    MenuItem add = menu.add(i5, epx.f(obj, s200.h) ? R.id.cut : epx.f(obj, s200.i) ? R.id.copy : epx.f(obj, s200.j) ? R.id.paste : epx.f(obj, s200.k) ? R.id.selectAll : epx.f(obj, s200.l) ? R.id.autofill : i4, i4, ((edo0) uco0Var).b);
                    add.setShowAsAction(2);
                    add.setOnMenuItemClickListener(new tc2(0, (edo0) uco0Var, this));
                } else if (uco0Var instanceof kdo0) {
                    i = i4 + 1;
                    final Context context = this.d.getContext();
                    kdo0 kdo0Var = (kdo0) uco0Var;
                    final TextClassification textClassification = kdo0Var.b;
                    int i6 = kdo0Var.c;
                    if (i6 < 0) {
                        MenuItem add2 = menu.add(R.id.textAssist, R.id.textAssist, i4, textClassification.getLabel());
                        add2.setShowAsAction(2);
                        add2.setIcon(textClassification.getIcon());
                        add2.setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener() { // from class: xsna.zmo0
                            @Override // android.view.MenuItem.OnMenuItemClickListener
                            public final boolean onMenuItemClick(MenuItem menuItem) {
                                ActivityOptions pendingIntentBackgroundActivityStartMode;
                                TextClassification textClassification2 = textClassification;
                                String text = textClassification2.getText();
                                PendingIntent activity = PendingIntent.getActivity(context, text != null ? text.hashCode() : 0, textClassification2.getIntent(), 201326592);
                                if (Build.VERSION.SDK_INT < 34) {
                                    activity.send();
                                    return true;
                                }
                                try {
                                    pendingIntentBackgroundActivityStartMode = ActivityOptions.makeBasic().setPendingIntentBackgroundActivityStartMode(1);
                                    activity.send(pendingIntentBackgroundActivityStartMode.toBundle());
                                    return true;
                                } catch (PendingIntent.CanceledException e) {
                                    Log.e("TextClassification", "error sending pendingIntent: " + activity + " error: " + e);
                                    return true;
                                }
                            }
                        });
                    } else {
                        int i7 = i6 == 0 ? 1 : i2;
                        final RemoteAction remoteAction = textClassification.getActions().get(i6);
                        MenuItem add3 = menu.add(R.id.textAssist, i7 != 0 ? 16908353 : i2, i4, remoteAction.getTitle());
                        add3.setShowAsAction(i7 == 0 ? 0 : 2);
                        if (i7 != 0 || remoteAction.shouldShowIcon()) {
                            add3.setIcon(remoteAction.getIcon().loadDrawable(context));
                        }
                        add3.setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener() { // from class: xsna.ano0
                            @Override // android.view.MenuItem.OnMenuItemClickListener
                            public final boolean onMenuItemClick(MenuItem menuItem) {
                                ActivityOptions pendingIntentBackgroundActivityStartMode;
                                PendingIntent actionIntent = remoteAction.getActionIntent();
                                if (Build.VERSION.SDK_INT < 34) {
                                    actionIntent.send();
                                    return true;
                                }
                                try {
                                    pendingIntentBackgroundActivityStartMode = ActivityOptions.makeBasic().setPendingIntentBackgroundActivityStartMode(1);
                                    actionIntent.send(pendingIntentBackgroundActivityStartMode.toBundle());
                                } catch (PendingIntent.CanceledException e) {
                                    Log.e("TextClassification", "error sending pendingIntent: " + actionIntent + " error: " + e);
                                }
                                return true;
                            }
                        });
                    }
                } else {
                    if (uco0Var instanceof ido0) {
                        i5++;
                    }
                    i3++;
                    i2 = 0;
                }
                i4 = i;
                i3++;
                i2 = 0;
            }
            return true;
        }
    }

    /* compiled from: AndroidTextContextMenuToolbarProvider.android.kt */
    public static final class b implements jdo0 {
        public final nm8 a = w0b.a(0, null, null, 7);

        @Override // xsna.jdo0
        public final void close() {
            this.a.f(s3q0.a);
        }
    }

    public uc2(View view, gzs gzsVar, izs izsVar) {
        this.a = view;
        this.b = izsVar;
        this.c = gzsVar;
    }

    @Override // xsna.gdo0
    public final Object a(wco0 wco0Var, SuspendLambda suspendLambda) {
        Object b2 = this.d.b(MutatePriority.Default, new xc2(this, wco0Var, null), suspendLambda);
        return b2 == CoroutineSingletons.COROUTINE_SUSPENDED ? b2 : s3q0.a;
    }
}
