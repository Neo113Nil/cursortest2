package xsna;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import kotlin.collections.EmptyList;
import xsna.r940;

/* compiled from: InMemoryMusicAnalyticsDataSource.kt */
/* loaded from: classes3.dex */
public final class fsw implements q940 {
    public final LinkedList<ax1> b;
    public r940 c;

    public fsw() {
        LinkedList<ax1> linkedList = new LinkedList<>();
        this.b = linkedList;
        this.c = new r940(new r940.a(0, linkedList.size()));
    }

    public final int a(s940 s940Var) {
        int i;
        i7z i7zVar = s940Var.a;
        if (i7zVar.d) {
            return 0;
        }
        long j = i7zVar.a;
        LinkedList<ax1> linkedList = this.b;
        ListIterator<ax1> listIterator = linkedList.listIterator(linkedList.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                i = -1;
                break;
            }
            if (j > listIterator.previous().b()) {
                i = listIterator.nextIndex();
                break;
            }
        }
        int i2 = i + 1;
        int size = linkedList.size();
        if (i2 > size) {
            i2 = size;
        }
        i7z i7zVar2 = s940Var.a;
        return Math.min(i2, i7zVar2.e ? i7zVar2.b : linkedList.size());
    }

    @Override // xsna.q940
    public final r940 b() {
        int i = this.c.a.b;
        LinkedList<ax1> linkedList = this.b;
        if (i != linkedList.size()) {
            this.c = new r940(new r940.a(0, linkedList.size()));
        }
        return this.c;
    }

    @Override // xsna.u940
    public final List<ax1> e(s940 s940Var) {
        int a = a(s940Var);
        return a == 0 ? EmptyList.b : this.b.subList(0, a);
    }

    @Override // xsna.u940
    public final List<ax1> f(s940 s940Var) {
        int a = a(s940Var);
        if (a == 0) {
            return EmptyList.b;
        }
        LinkedList<ax1> linkedList = this.b;
        List<ax1> subList = linkedList.subList(0, a);
        linkedList.removeAll(j5g.S0(subList));
        return subList;
    }

    @Override // xsna.q940
    public final ax1 h() {
        LinkedList<ax1> linkedList = this.b;
        if (linkedList.isEmpty()) {
            return null;
        }
        return linkedList.remove(0);
    }

    @Override // xsna.q940
    public final void i(ax1 ax1Var) {
        this.b.add(ax1Var);
    }
}
