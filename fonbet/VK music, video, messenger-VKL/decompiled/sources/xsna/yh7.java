package xsna;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.fragment.app.FragmentActivity;
import com.vk.api.sdk.exceptions.VKApiExecutionException;
import com.vk.comments.core.BoardComment;
import com.vk.dto.common.id.UserId;
import com.vk.topics.impl.api.BoardGetComments;
import com.vk.topics.impl.fragments.BoardTopicViewFragment;
import com.vkontakte.android.attachments.PollAttachment;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: BoardCommentsLoader.java */
/* loaded from: classes6.dex */
public final class yh7 {
    public int b;
    public volatile boolean g;
    public volatile boolean i;
    public volatile boolean j;
    public final UserId k;
    public int l;

    @NonNull
    public final BoardTopicViewFragment n;
    public boolean o;
    public final AtomicInteger a = new AtomicInteger(0);
    public int c = -1;
    public final ArrayList<LinkedList<BoardComment>> d = new ArrayList<>();
    public LinkedList<BoardComment> e = new LinkedList<>();
    public volatile io.reactivex.rxjava3.disposables.c f = null;
    public volatile boolean h = false;
    public final int m = 20;

    /* compiled from: BoardCommentsLoader.java */
    public class a implements hx2<BoardGetComments.b> {
        public final /* synthetic */ int b;

        public a(int i, Context context) {
            this.b = i;
        }

        @Override // xsna.hx2
        public final void b(BoardGetComments.b bVar) {
            BoardGetComments.b bVar2 = bVar;
            if (this.b == yh7.this.a.get()) {
                int size = yh7.this.e.size();
                yh7.a(yh7.this, bVar2, false);
                int size2 = bVar2.a.size();
                yh7 yh7Var = yh7.this;
                if (size2 < yh7Var.m * 2) {
                    yh7Var.h = true;
                    if (size == 0) {
                        yh7.this.f();
                    }
                }
                yh7.this.g = false;
                yh7 yh7Var2 = yh7.this;
                BoardTopicViewFragment boardTopicViewFragment = yh7Var2.n;
                yh7Var2.e.size();
                boardTopicViewFragment.xo();
                yh7 yh7Var3 = yh7.this;
                if (yh7Var3.o) {
                    yh7Var3.o = false;
                    yh7Var3.n.Ao(yh7Var3.e.size() - 1, false);
                }
            }
        }

        @Override // xsna.hx2
        public final void e(VKApiExecutionException vKApiExecutionException) {
            if (this.b == yh7.this.a.get()) {
                yh7.this.g = false;
                yh7 yh7Var = yh7.this;
                BoardTopicViewFragment boardTopicViewFragment = yh7Var.n;
                yh7Var.e.size();
                boardTopicViewFragment.xo();
                yh7.this.n.wo();
            }
        }
    }

    public yh7(UserId userId, int i, @NonNull BoardTopicViewFragment boardTopicViewFragment, boolean z) {
        this.k = userId;
        this.l = i;
        this.n = boardTopicViewFragment;
        this.o = z;
    }

    public static int a(yh7 yh7Var, BoardGetComments.b bVar, boolean z) {
        int size;
        PollAttachment pollAttachment = bVar.c;
        if (pollAttachment != null) {
            BoardTopicViewFragment.c cVar = yh7Var.n.p0;
            cVar.c = pollAttachment;
            cVar.notifyDataSetChanged();
        }
        if (z) {
            ArrayList<BoardComment> arrayList = bVar.a;
            size = arrayList.size();
            while (!yh7Var.e.isEmpty() && arrayList.contains(yh7Var.e.getFirst())) {
                yh7Var.e.removeFirst();
                size--;
            }
            yh7Var.e.addAll(0, arrayList);
            yh7Var.j = size == 0;
            yh7Var.n.uo(new ArrayList(yh7Var.e), size, true);
        } else {
            ArrayList<BoardComment> arrayList2 = bVar.a;
            size = arrayList2.size();
            yh7Var.e.size();
            while (!yh7Var.e.isEmpty() && arrayList2.contains(yh7Var.e.getLast())) {
                yh7Var.e.removeLast();
                size--;
            }
            yh7Var.e.addAll(arrayList2);
            yh7Var.h = size == 0;
            yh7Var.n.uo(new ArrayList(yh7Var.e), size, false);
        }
        if (bVar.b < yh7Var.c) {
            yh7Var.d.clear();
        }
        int i = bVar.b;
        if (yh7Var.e.size() > i) {
            i = yh7Var.e.size();
        }
        yh7Var.c = i;
        yh7Var.n.qo();
        return size;
    }

    public static boolean b(LinkedList<BoardComment> linkedList, int i) {
        return !linkedList.isEmpty() && i >= linkedList.getFirst().n && i <= linkedList.getLast().n;
    }

    public static int g(LinkedList<BoardComment> linkedList, BoardComment boardComment) {
        Iterator<BoardComment> it = linkedList.iterator();
        int i = -1;
        int i2 = 0;
        while (it.hasNext()) {
            BoardComment next = it.next();
            if (boardComment.equals(next)) {
                it.remove();
                i = i2;
            } else {
                int i3 = boardComment.n;
                int i4 = next.n;
                if (i3 < i4) {
                    next.n = i4 - 1;
                }
            }
            i2++;
        }
        return i;
    }

    public final void c(int i, Context context) {
        this.a.incrementAndGet();
        this.g = false;
        this.h = false;
        this.i = false;
        this.j = false;
        this.b = i;
        this.c = -1;
        if (!this.e.isEmpty()) {
            this.d.add(this.e);
        }
        this.e = new LinkedList<>();
        this.n.zo();
        e(context);
    }

    public final void d(BoardComment boardComment) {
        if (this.e.isEmpty()) {
            return;
        }
        int i = this.e.getLast().n;
        int i2 = this.c;
        if (i == i2 - 1) {
            boardComment.n = i2;
            this.e.add(boardComment);
            this.c++;
            BoardTopicViewFragment boardTopicViewFragment = this.n;
            boardTopicViewFragment.qo();
            boardTopicViewFragment.uo(new ArrayList(this.e), 1, false);
            boardTopicViewFragment.Ao(this.c - 1, true);
        }
    }

    public final synchronized void e(Context context) {
        try {
            if (!this.g && !this.h) {
                this.g = true;
                int i = this.a.get();
                this.n.yo(this.e.size());
                new jx2(this.o ? new BoardGetComments(this.k, this.l, this.m * 2, BoardGetComments.PagingKey.offset, this.b) : this.e.isEmpty() ? new BoardGetComments(this.k, this.l, this.m * 2, BoardGetComments.PagingKey.offset, this.b) : new BoardGetComments(this.k, this.l, this.m * 2, BoardGetComments.PagingKey.startCommentId, this.e.getLast().b), new a(i, context)).a();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void f() {
        try {
            if (!this.i && !this.j && this.c > 0 && this.b > 0) {
                int i = this.a.get();
                this.i = true;
                this.n.yo(this.e.size());
                if (this.f != null) {
                    this.f.dispose();
                }
                UserId userId = this.k;
                int i2 = this.l;
                int i3 = this.m;
                this.f = new jx2(new BoardGetComments(userId, i2, i3 * 2, BoardGetComments.PagingKey.offset, Math.max(this.b - i3, 0)), new xh7(this, i)).a();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final void h(int i, FragmentActivity fragmentActivity) {
        LinkedList<BoardComment> linkedList;
        this.a.incrementAndGet();
        BoardTopicViewFragment boardTopicViewFragment = this.n;
        this.e.size();
        boardTopicViewFragment.xo();
        BoardTopicViewFragment boardTopicViewFragment2 = this.n;
        this.e.size();
        boardTopicViewFragment2.xo();
        if (b(this.e, i)) {
            Iterator<BoardComment> it = this.e.iterator();
            int i2 = 0;
            while (it.hasNext()) {
                if (it.next().n == i) {
                    this.n.Ao(i2, false);
                }
                i2++;
            }
            if (i - this.m <= (this.e.isEmpty() ? 0 : this.e.getFirst().n)) {
                f();
            }
            if (i + this.m >= (this.e.isEmpty() ? 0 : this.e.getLast().n)) {
                e(fragmentActivity);
                return;
            }
            return;
        }
        Iterator<LinkedList<BoardComment>> it2 = this.d.iterator();
        while (true) {
            if (!it2.hasNext()) {
                linkedList = null;
                break;
            } else {
                linkedList = it2.next();
                if (b(linkedList, i)) {
                    break;
                }
            }
        }
        if (linkedList == null) {
            c(i, fragmentActivity);
            return;
        }
        this.g = false;
        this.h = false;
        this.i = false;
        this.j = false;
        this.b = i;
        this.c = -1;
        if (!this.e.isEmpty()) {
            this.d.add(this.e);
        }
        this.e = linkedList;
        this.n.zo();
        BoardTopicViewFragment boardTopicViewFragment3 = this.n;
        int i3 = this.e.getFirst().n;
        boardTopicViewFragment3.uo(new ArrayList(this.e), this.e.size(), false);
        Iterator<BoardComment> it3 = this.e.iterator();
        int i4 = 0;
        while (it3.hasNext()) {
            if (it3.next().n == i) {
                this.n.Ao(i4, false);
            }
            i4++;
        }
    }
}
