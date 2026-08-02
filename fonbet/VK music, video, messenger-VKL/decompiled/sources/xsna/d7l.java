package xsna;

import com.vkontakte.android.R;
import java.util.TimerTask;

/* compiled from: UiTrackerDebugViewer.kt */
/* loaded from: classes17.dex */
public final class d7l extends TimerTask {
    public final /* synthetic */ e7l b;

    public d7l(e7l e7lVar) {
        this.b = e7lVar;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        long currentTimeMillis = System.currentTimeMillis();
        final e7l e7lVar = this.b;
        final long j = currentTimeMillis - e7lVar.g;
        e7lVar.d.post(new Runnable() { // from class: xsna.c7l
            @Override // java.lang.Runnable
            public final void run() {
                e7l e7lVar2 = e7l.this;
                e7lVar2.d.setText(e7lVar2.getResources().getString(R.string.current_time_spent, Long.valueOf(j)));
            }
        });
    }
}
