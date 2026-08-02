package xsna;

import com.vk.dto.common.id.UserId;
import com.vk.dto.music.audiobook.AudioBook;
import com.vk.dto.music.audiobook.AudioBookChapter;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class og40 implements Callable {
    public final /* synthetic */ sg40 b;
    public final /* synthetic */ UserId c;
    public final /* synthetic */ AudioBook d;

    public /* synthetic */ og40(sg40 sg40Var, UserId userId, AudioBook audioBook) {
        this.b = sg40Var;
        this.c = userId;
        this.d = audioBook;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        AudioBook audioBook = this.d;
        List<AudioBookChapter> list = audioBook.k;
        sg40 sg40Var = this.b;
        UserId userId = this.c;
        ArrayList d = sg40Var.d(userId, list);
        qh4 qh4Var = sg40Var.h;
        qh4Var.C(audioBook.b, userId);
        sg40Var.a.T(audioBook);
        if (qh4Var.D(userId).isEmpty()) {
            sg40Var.d.b(st1.a);
        }
        return d;
    }
}
