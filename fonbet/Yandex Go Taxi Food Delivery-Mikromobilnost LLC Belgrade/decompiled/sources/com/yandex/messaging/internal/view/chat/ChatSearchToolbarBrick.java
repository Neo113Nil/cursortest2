package com.yandex.messaging.internal.view.chat;

import android.app.Activity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.yandex.bricks.Brick;
import com.yandex.messaging.ChatRequest;
import com.yandex.messaging.domain.SimpleFlowUseCase$subscribe$$inlined$suspendDisposable$1$1;
import com.yandex.messaging.internal.view.chat.ChatSearchToolbarBrick;
import com.yandex.messaging.views.SearchEditText;
import defpackage.cwp0;
import defpackage.e48;
import defpackage.e9h0;
import defpackage.g8a1;
import defpackage.j3b;
import defpackage.k9b;
import defpackage.m9b;
import defpackage.ny61;
import defpackage.olh0;
import defpackage.oyh0;
import defpackage.p4t;
import defpackage.pu31;
import defpackage.q9b;
import defpackage.tje;
import defpackage.tse;
import defpackage.xcz0;
import defpackage.zq60;
import java.util.ArrayList;

/* loaded from: classes15.dex */
public class ChatSearchToolbarBrick extends Brick implements TextWatcher {
    private final ChatRequest mChatRequest;
    private View mClearInput;
    private q9b mDelegate;
    private final p4t mGetChatInfoUseCase;
    private final SearchEditText mSearchInput;
    private final cwp0 mSearchQueryState;
    private final View mToolbar;

    public ChatSearchToolbarBrick(Activity activity, cwp0 cwp0Var, pu31 pu31Var, p4t p4tVar, ChatRequest chatRequest) {
        View inflate = LayoutInflater.from(activity).inflate(olh0.msg_b_chat_search_toolbar, (ViewGroup) null);
        this.mToolbar = inflate;
        this.mSearchQueryState = cwp0Var;
        SearchEditText searchEditText = (SearchEditText) g8a1.e(e9h0.chat_search_input, inflate);
        this.mSearchInput = searchEditText;
        this.mClearInput = g8a1.e(e9h0.chat_search_clear_input_button, inflate);
        View e = g8a1.e(e9h0.chat_search_back, inflate);
        this.mGetChatInfoUseCase = p4tVar;
        this.mChatRequest = chatRequest;
        final int i = 0;
        e.setOnClickListener(new View.OnClickListener(this) { // from class: p9b
            public final /* synthetic */ ChatSearchToolbarBrick b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i2 = i;
                ChatSearchToolbarBrick chatSearchToolbarBrick = this.b;
                switch (i2) {
                    case 0:
                        chatSearchToolbarBrick.lambda$new$0(view);
                        break;
                    default:
                        chatSearchToolbarBrick.lambda$new$2(view);
                        break;
                }
            }
        });
        searchEditText.setOnBackClickListener(new e48(22, this));
        searchEditText.addTextChangedListener(this);
        pu31Var.a(searchEditText, "search_input", null);
        final int i2 = 1;
        this.mClearInput.setOnClickListener(new View.OnClickListener(this) { // from class: p9b
            public final /* synthetic */ ChatSearchToolbarBrick b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i22 = i2;
                ChatSearchToolbarBrick chatSearchToolbarBrick = this.b;
                switch (i22) {
                    case 0:
                        chatSearchToolbarBrick.lambda$new$0(view);
                        break;
                    default:
                        chatSearchToolbarBrick.lambda$new$2(view);
                        break;
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void lambda$new$0(View view) {
        q9b q9bVar = this.mDelegate;
        if (q9bVar != null) {
            ((xcz0) q9bVar).a.a();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean lambda$new$1() {
        q9b q9bVar = this.mDelegate;
        if (q9bVar == null) {
            return false;
        }
        ((xcz0) q9bVar).a.a();
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$2(View view) {
        this.mSearchInput.setText("");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onChatInfoAvailable(j3b j3bVar) {
        this.mSearchInput.setHint(j3bVar.I ? oyh0.messaging_channel_search_input_hint : oyh0.messaging_chat_search_input_hint);
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(Editable editable) {
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // com.yandex.bricks.Brick
    public View getView() {
        return this.mToolbar;
    }

    public void hideSearch() {
        this.mToolbar.setVisibility(8);
    }

    @Override // com.yandex.bricks.Brick
    public void onBrickAttach(Bundle bundle) {
        super.onBrickAttach(bundle);
        p4t p4tVar = this.mGetChatInfoUseCase;
        ChatRequest chatRequest = this.mChatRequest;
        tse brickScope = getBrickScope();
        k9b k9bVar = new k9b(1, this);
        p4tVar.getClass();
        tje.N(brickScope, null, null, new SimpleFlowUseCase$subscribe$$inlined$suspendDisposable$1$1(null, p4tVar, chatRequest, k9bVar), 3);
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        boolean z;
        cwp0 cwp0Var = this.mSearchQueryState;
        cwp0Var.b = charSequence.toString();
        zq60 zq60Var = cwp0Var.a;
        zq60Var.getClass();
        zq60Var.b++;
        ArrayList arrayList = zq60Var.a;
        int size = arrayList.size();
        int i4 = 0;
        boolean z2 = false;
        while (true) {
            int i5 = i4;
            while (i5 < size && arrayList.get(i5) == null) {
                i5++;
            }
            if (i5 < size) {
                z = true;
            } else {
                if (!z2) {
                    zq60.a(zq60Var);
                    z2 = true;
                }
                z = false;
            }
            if (!z) {
                this.mClearInput.setVisibility(charSequence.length() == 0 ? 8 : 0);
                return;
            }
            while (i4 < size && arrayList.get(i4) == null) {
                i4++;
            }
            if (i4 >= size) {
                if (!z2) {
                    zq60.a(zq60Var);
                }
                ny61.p();
                return;
            }
            ((m9b) arrayList.get(i4)).q(cwp0Var.b);
            i4++;
        }
    }

    public void setNavigationDelegate(q9b q9bVar) {
        this.mDelegate = q9bVar;
    }

    public void showSearch() {
        boolean z;
        this.mToolbar.setVisibility(0);
        cwp0 cwp0Var = this.mSearchQueryState;
        cwp0Var.b = "";
        zq60 zq60Var = cwp0Var.a;
        zq60Var.getClass();
        zq60Var.b++;
        ArrayList arrayList = zq60Var.a;
        int size = arrayList.size();
        int i = 0;
        boolean z2 = false;
        while (true) {
            int i2 = i;
            while (i2 < size && arrayList.get(i2) == null) {
                i2++;
            }
            if (i2 < size) {
                z = true;
            } else {
                if (!z2) {
                    zq60.a(zq60Var);
                    z2 = true;
                }
                z = false;
            }
            if (!z) {
                this.mSearchInput.setText("");
                this.mSearchInput.requestFocus();
                return;
            }
            while (i < size && arrayList.get(i) == null) {
                i++;
            }
            if (i >= size) {
                if (!z2) {
                    zq60.a(zq60Var);
                }
                ny61.p();
                return;
            } else {
                ((m9b) arrayList.get(i)).q(cwp0Var.b);
                i++;
            }
        }
    }
}
