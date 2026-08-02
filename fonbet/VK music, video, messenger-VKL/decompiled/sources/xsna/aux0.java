package xsna;

import com.vk.im.engine.models.messages.MsgReaction;
import java.util.List;

/* compiled from: WithReactions.kt */
/* loaded from: classes2.dex */
public interface aux0 {
    List<MsgReaction> K();

    default boolean Qa() {
        return !K().isEmpty();
    }

    Integer R5();

    void d(Integer num);

    void f5(List<? extends MsgReaction> list);
}
