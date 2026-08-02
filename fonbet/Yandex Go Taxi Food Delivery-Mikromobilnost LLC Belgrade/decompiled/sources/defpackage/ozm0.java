package defpackage;

import android.view.View;
import android.view.ViewGroup;
import com.yandex.go.scooters.misc.attention.data.ScootersAttentionRepositoryImpl$listenToScootersAttention$$inlined$withPreviousEmit$1;
import com.yandex.go.scooters.misc.attention.data.b;
import com.yandex.go.scooters.misc.attention.data.d;
import com.yandex.go.scooters.misc.attention.data.e;
import com.yandex.go.scooters.misc.attention.domain.c;
import com.yandex.go.scooters.misc.attention.ui.ScootersAttentionViewPresenter$attachView$$inlined$collectLatestIn$1;
import kotlinx.coroutines.flow.j0;
import ru.yandex.taxi.design.DialogueComponent;
import ru.yandex.taxi.design.ListItemComponent;

/* loaded from: classes13.dex */
public final class ozm0 implements lzm0 {
    public final pzm0 a;
    public ListItemComponent b;
    public tls c;
    public tls d;
    public DialogueComponent e;
    public boolean f;

    public ozm0(pzm0 pzm0Var) {
        this.a = pzm0Var;
    }

    public final void a(View view, tls tlsVar, tls tlsVar2, tls tlsVar3) {
        this.c = tlsVar;
        this.d = tlsVar2;
        ListItemComponent listItemComponent = new ListItemComponent(view.getContext(), null, 0, 6, null);
        listItemComponent.setLayoutParams(new ViewGroup.MarginLayoutParams(-1, -2));
        listItemComponent.setId(l7h0.scooters_attention_header);
        listItemComponent.setMinHeight(tje.u(48, listItemComponent.getContext()));
        listItemComponent.setLeadImageSize(tje.u(48, listItemComponent.getContext()));
        listItemComponent.setVerticalPadding(tje.u(8, listItemComponent.getContext()));
        listItemComponent.setSubtitleMaxLines(3);
        DialogueComponent dialogueComponent = new DialogueComponent(view.getContext(), null, 0, 6, null);
        dialogueComponent.setLayoutParams(new ViewGroup.MarginLayoutParams(-1, -2));
        dialogueComponent.setHeaderView(listItemComponent);
        dialogueComponent.setContentView(view);
        dialogueComponent.setAnimationType(DialogueComponent.AnimationType.CONTENT_SLIDE_BOTTOM);
        tlsVar3.invoke(dialogueComponent);
        this.b = listItemComponent;
        this.e = dialogueComponent;
        mzm0 mzm0Var = new mzm0(this);
        pzm0 pzm0Var = this.a;
        pzm0Var.Bg(mzm0Var);
        c cVar = (c) pzm0Var.y;
        e eVar = cVar.b;
        d dVar = new d(new b(kotlinx.coroutines.flow.e.r(new mth(new j0(null, eVar.d, new ScootersAttentionRepositoryImpl$listenToScootersAttention$$inlined$withPreviousEmit$1(3, null)), 6), new umm0(21)), eVar), eVar);
        eVar.b.getClass();
        tje.N(pzm0Var.Jg(), null, null, new ScootersAttentionViewPresenter$attachView$$inlined$collectLatestIn$1(new com.yandex.go.scooters.misc.attention.domain.b(kotlinx.coroutines.flow.e.t(kotlinx.coroutines.flow.e.F(dVar, uyj.a)), cVar), null, mzm0Var), 3);
    }
}
