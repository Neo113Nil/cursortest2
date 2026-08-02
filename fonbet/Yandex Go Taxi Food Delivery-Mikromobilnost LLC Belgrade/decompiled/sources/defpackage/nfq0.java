package defpackage;

import android.util.LongSparseArray;
import com.yandex.messaging.internal.LocalMessageRef;
import com.yandex.messaging.internal.ServerMessageRef;
import com.yandex.messaging.internal.view.input.selection.SelectedMessagesPanel;

/* loaded from: classes15.dex */
public final class nfq0 implements e1k {
    public SelectedMessagesPanel a;
    public final LongSparseArray b = new LongSparseArray();
    public final /* synthetic */ ofq0 c;

    public nfq0(ofq0 ofq0Var, SelectedMessagesPanel selectedMessagesPanel) {
        this.c = ofq0Var;
        this.a = selectedMessagesPanel;
    }

    public final void a(long j, LocalMessageRef localMessageRef) {
        tje.e();
        z83.d(this.a, null);
        LongSparseArray longSparseArray = this.b;
        if (longSparseArray.get(j) != null) {
            return;
        }
        if (localMessageRef != null) {
            ofq0 ofq0Var = this.c;
            longSparseArray.put(j, new qhs0(ofq0Var.a, ofq0Var.b, localMessageRef, new mmp0(6, this)));
        } else {
            longSparseArray.put(j, null);
        }
        c();
    }

    public final void c() {
        tje.e();
        SelectedMessagesPanel selectedMessagesPanel = this.a;
        if (selectedMessagesPanel == null) {
            return;
        }
        LongSparseArray longSparseArray = this.b;
        boolean z = longSparseArray.size() != 0;
        boolean z2 = longSparseArray.size() != 0 && longSparseArray.size() < 100;
        int size = longSparseArray.size();
        boolean z3 = false;
        boolean z4 = false;
        ServerMessageRef serverMessageRef = null;
        ServerMessageRef serverMessageRef2 = null;
        for (int i = 0; i < size; i++) {
            qhs0 qhs0Var = (qhs0) longSparseArray.valueAt(i);
            ru10 ru10Var = qhs0Var != null ? qhs0Var.x : null;
            if (ru10Var != null) {
                z &= ru10Var.d != null;
                z2 &= ru10Var.f != null;
                ServerMessageRef serverMessageRef3 = ru10Var.g;
                serverMessageRef2 = ru10Var.j;
                boolean z5 = ru10Var.w;
                z4 = z4 || jl40.l(ru10Var.s, Boolean.TRUE);
                serverMessageRef = serverMessageRef3;
                z3 = z5;
            } else {
                z = false;
                z2 = false;
                serverMessageRef = null;
                serverMessageRef2 = null;
            }
        }
        if (longSparseArray.size() != 1) {
            serverMessageRef = null;
            serverMessageRef2 = null;
        }
        selectedMessagesPanel.onCanBeSharedAndCopied(z3);
        if (z4) {
            selectedMessagesPanel.onCanBeDeleted(false);
            selectedMessagesPanel.onCanBeForwarded(false);
            selectedMessagesPanel.onCanBeReplied(null);
            selectedMessagesPanel.onCanBePinned(null);
            return;
        }
        selectedMessagesPanel.onCanBeDeleted(z);
        selectedMessagesPanel.onCanBeForwarded(z2);
        selectedMessagesPanel.onCanBeReplied(serverMessageRef);
        selectedMessagesPanel.onCanBePinned(serverMessageRef2);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.a = null;
        LongSparseArray longSparseArray = this.b;
        int size = longSparseArray.size();
        for (int i = 0; i < size; i++) {
            qhs0 qhs0Var = (qhs0) longSparseArray.valueAt(i);
            if (qhs0Var != null) {
                qhs0Var.close();
            }
        }
        longSparseArray.clear();
    }
}
