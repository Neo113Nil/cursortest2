package xsna;

import com.vk.dto.common.Attachment;
import com.vk.dto.common.id.UserId;
import com.vk.dto.reactions.ReactionMeta;
import java.util.ArrayList;

/* compiled from: CommentsInteractor.kt */
/* loaded from: classes17.dex */
public interface teg {
    void a(iag iagVar);

    void b(iag iagVar, ReactionMeta reactionMeta);

    UserId c();

    io.reactivex.rxjava3.core.q<lgg> d();

    void e();

    void f(iag iagVar, String str, boolean z);

    void g(UserId userId);

    io.reactivex.rxjava3.core.q<kgg> h();

    io.reactivex.rxjava3.core.q<rag> i();

    void j(String str, ArrayList<Attachment> arrayList, boolean z);

    void k(iag iagVar);

    UserId p();
}
