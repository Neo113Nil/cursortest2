package com.yandex.messaging.internal.view.chat;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.emoji2.widget.EmojiTextView;
import com.yandex.bricks.Brick;
import com.yandex.messaging.ChatRequest;
import com.yandex.messaging.internal.translator.k;
import defpackage.ai91;
import defpackage.cd0;
import defpackage.cma1;
import defpackage.e9h0;
import defpackage.gzw;
import defpackage.h3y;
import defpackage.hi91;
import defpackage.m2y;
import defpackage.mdb;
import defpackage.ny61;
import defpackage.olh0;
import defpackage.oyh0;
import defpackage.sz01;
import defpackage.tje;
import defpackage.zy01;
import defpackage.zy11;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes15.dex */
public final class e extends Brick {
    public final m2y A;
    public boolean B;
    public boolean C;
    public boolean D;
    public final Activity a;
    public final ChatRequest b;
    public final k c;
    public final gzw w;
    public final com.yandex.messaging.internal.translator.b x;
    public final h3y y;
    public final sz01 z;

    public e(Activity activity, mdb mdbVar, ChatRequest chatRequest, k kVar, gzw gzwVar, com.yandex.messaging.internal.translator.b bVar, h3y h3yVar) {
        this.a = activity;
        this.b = chatRequest;
        this.c = kVar;
        this.w = gzwVar;
        this.x = bVar;
        this.y = h3yVar;
        this.z = mdbVar.p;
        View inflate = activity.getLayoutInflater().inflate(olh0.msg_b_chat_translator, (ViewGroup) null, false);
        int i = e9h0.pinned_bottom_separator;
        View O = cma1.O(i, inflate);
        if (O != null) {
            i = e9h0.translator_announcement;
            EmojiTextView emojiTextView = (EmojiTextView) cma1.O(i, inflate);
            if (emojiTextView != null) {
                i = e9h0.translator_title;
                EmojiTextView emojiTextView2 = (EmojiTextView) cma1.O(i, inflate);
                if (emojiTextView2 != null) {
                    this.A = new m2y((ConstraintLayout) inflate, O, emojiTextView, emojiTextView2, 2);
                    this.B = true;
                    tje.e();
                    return;
                }
            }
        }
        ny61.t("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i)));
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object q(e eVar, String str, String str2, ContinuationImpl continuationImpl) {
        ChatTranslatorBrick$onLangChanged$1 chatTranslatorBrick$onLangChanged$1;
        int i;
        eVar.getClass();
        if (continuationImpl instanceof ChatTranslatorBrick$onLangChanged$1) {
            chatTranslatorBrick$onLangChanged$1 = (ChatTranslatorBrick$onLangChanged$1) continuationImpl;
            int i2 = chatTranslatorBrick$onLangChanged$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                chatTranslatorBrick$onLangChanged$1.label = i2 - Integer.MIN_VALUE;
                Object obj = chatTranslatorBrick$onLangChanged$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = chatTranslatorBrick$onLangChanged$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    boolean z = eVar.B;
                    eVar.B = false;
                    if (str == null) {
                        m2y m2yVar = eVar.A;
                        ((EmojiTextView) m2yVar.e).setText(eVar.a.getString(oyh0.translator_chat_translate_text));
                        hi91.g(new ChatTranslatorBrick$showUntranslatedState$1(eVar, str2, null), (ConstraintLayout) m2yVar.c);
                        return zy11.a;
                    }
                    if (z) {
                        chatTranslatorBrick$onLangChanged$1.L$0 = eVar;
                        chatTranslatorBrick$onLangChanged$1.label = 1;
                        if (eVar.s(chatTranslatorBrick$onLangChanged$1) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    eVar = (e) chatTranslatorBrick$onLangChanged$1.L$0;
                    kotlin.b.b(obj);
                }
                m2y m2yVar2 = eVar.A;
                ((EmojiTextView) m2yVar2.e).setText(eVar.a.getString(oyh0.translator_chat_show_original_text));
                hi91.g(new ChatTranslatorBrick$showTranslatedState$1(eVar, null), (ConstraintLayout) m2yVar2.c);
                return zy11.a;
            }
        }
        chatTranslatorBrick$onLangChanged$1 = new ChatTranslatorBrick$onLangChanged$1(eVar, continuationImpl);
        Object obj2 = chatTranslatorBrick$onLangChanged$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = chatTranslatorBrick$onLangChanged$1.label;
        if (i != 0) {
        }
        m2y m2yVar22 = eVar.A;
        ((EmojiTextView) m2yVar22.e).setText(eVar.a.getString(oyh0.translator_chat_show_original_text));
        hi91.g(new ChatTranslatorBrick$showTranslatedState$1(eVar, null), (ConstraintLayout) m2yVar22.c);
        return zy11.a;
    }

    @Override // com.yandex.bricks.Brick
    public final View getView() {
        ConstraintLayout constraintLayout = (ConstraintLayout) this.A.c;
        r();
        return constraintLayout;
    }

    @Override // com.yandex.bricks.Brick, defpackage.ak6
    public final void onBrickAttach() {
        sz01 sz01Var;
        super.onBrickAttach();
        gzw gzwVar = this.w;
        if (gzwVar.c && (sz01Var = this.z) != null) {
            if (((zy01) this.y.get()).c) {
                r();
                return;
            }
            ChatRequest chatRequest = this.b;
            kotlinx.coroutines.flow.e.H(getBrickScope(), new cd0(21, gzwVar.a(chatRequest), this));
            ai91.c((EmojiTextView) this.A.e, false);
            com.yandex.messaging.extension.flow.c.b(this.c.b(chatRequest), getBrickScope(), new ChatTranslatorBrick$onBrickAttach$2(this, sz01Var, null));
        }
    }

    @Override // com.yandex.bricks.Brick, defpackage.ak6
    public final void onBrickDetach() {
        super.onBrickDetach();
        r();
    }

    public final void r() {
        this.D = false;
        u();
        m2y m2yVar = this.A;
        ai91.c((EmojiTextView) m2yVar.e, false);
        ConstraintLayout constraintLayout = (ConstraintLayout) m2yVar.c;
        hi91.g(new ChatTranslatorBrick$hideContent$1(1, null), constraintLayout);
        constraintLayout.setLayoutTransition(null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0072, code lost:
    
        if (kotlinx.coroutines.a.i(2000, r0) != r1) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0074, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x005c, code lost:
    
        if (kotlinx.coroutines.a.i(1000, r0) == r1) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object s(ContinuationImpl continuationImpl) {
        ChatTranslatorBrick$showAnnouncement$1 chatTranslatorBrick$showAnnouncement$1;
        int i;
        if (continuationImpl instanceof ChatTranslatorBrick$showAnnouncement$1) {
            chatTranslatorBrick$showAnnouncement$1 = (ChatTranslatorBrick$showAnnouncement$1) continuationImpl;
            int i2 = chatTranslatorBrick$showAnnouncement$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                chatTranslatorBrick$showAnnouncement$1.label = i2 - Integer.MIN_VALUE;
                Object obj = chatTranslatorBrick$showAnnouncement$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = chatTranslatorBrick$showAnnouncement$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    m2y m2yVar = this.A;
                    ((ConstraintLayout) m2yVar.c).setEnabled(false);
                    ((EmojiTextView) m2yVar.e).setAlpha(0.0f);
                    chatTranslatorBrick$showAnnouncement$1.L$0 = this;
                    chatTranslatorBrick$showAnnouncement$1.label = 1;
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        this = (e) chatTranslatorBrick$showAnnouncement$1.L$0;
                        kotlin.b.b(obj);
                        m2y m2yVar2 = this.A;
                        ai91.c((EmojiTextView) m2yVar2.b, false);
                        ((EmojiTextView) m2yVar2.e).setAlpha(1.0f);
                        ((ConstraintLayout) m2yVar2.c).setEnabled(true);
                        return zy11.a;
                    }
                    this = (e) chatTranslatorBrick$showAnnouncement$1.L$0;
                    kotlin.b.b(obj);
                }
                ai91.f((EmojiTextView) this.A.b, false);
                chatTranslatorBrick$showAnnouncement$1.L$0 = this;
                chatTranslatorBrick$showAnnouncement$1.label = 2;
            }
        }
        chatTranslatorBrick$showAnnouncement$1 = new ChatTranslatorBrick$showAnnouncement$1(this, continuationImpl);
        Object obj2 = chatTranslatorBrick$showAnnouncement$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = chatTranslatorBrick$showAnnouncement$1.label;
        if (i != 0) {
        }
        ai91.f((EmojiTextView) this.A.b, false);
        chatTranslatorBrick$showAnnouncement$1.L$0 = this;
        chatTranslatorBrick$showAnnouncement$1.label = 2;
    }

    public final void u() {
        ((ConstraintLayout) this.A.c).setVisibility((!this.D || this.C) ? 8 : 0);
    }
}
