package com.yandex.go.feed_video.presentation.divkit;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.fragment.app.FragmentActivity;
import com.yandex.div.core.player.DivPlayerView;
import defpackage.i3y;
import defpackage.ppr;
import defpackage.r4l;
import defpackage.ssv;
import defpackage.tje;
import defpackage.tsv;
import defpackage.u4l;
import defpackage.v4l;
import defpackage.wwx;
import defpackage.x43;
import defpackage.xzq0;
import defpackage.zty;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import kotlin.coroutines.EmptyCoroutineContext;
import ru.yandex.video.m3.list_player_manager.ListYandexPlayer;

/* loaded from: classes.dex */
public final class c implements u4l {
    public final FragmentActivity b;
    public final com.yandex.go.feed_video.domain.manager.a c;
    public final xzq0 d;
    public final tsv e;
    public final LinkedHashSet f = new LinkedHashSet();
    public final x43 g = new x43(5);
    public final int h = 6;
    public final i3y i;
    public final i3y j;

    public c(FragmentActivity fragmentActivity, com.yandex.go.feed_video.domain.manager.a aVar, xzq0 xzq0Var) {
        this.b = fragmentActivity;
        this.c = aVar;
        this.d = xzq0Var;
        i3y a = kotlin.a.a(new wwx(17));
        this.i = a;
        this.j = kotlin.a.a(new ppr(21, this));
        if (this.e == null) {
            tsv tsvVar = new tsv();
            tsvVar.a(fragmentActivity, ((Number) a.getValue()).intValue(), 6);
            this.e = tsvVar;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0069  */
    @Override // defpackage.u4l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final DivPlayerView a(Context context) {
        View view;
        ListYandexDivPlayerView listYandexDivPlayerView = (ListYandexDivPlayerView) this.g.m();
        if (listYandexDivPlayerView != null) {
            ViewParent parent = listYandexDivPlayerView.getParent();
            ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
            if (viewGroup != null) {
                viewGroup.removeAllViews();
            }
        } else {
            Context applicationContext = context.getApplicationContext();
            int i = this.h / 2;
            i3y i3yVar = this.i;
            tsv tsvVar = this.e;
            if (tsvVar != null) {
                tsvVar.a(applicationContext, ((Number) i3yVar.getValue()).intValue(), i);
            }
            if (tsvVar != null) {
                LinkedList linkedList = (LinkedList) tsvVar.a.get(new ssv(applicationContext, ((Number) i3yVar.getValue()).intValue()));
                if (linkedList != null && !linkedList.isEmpty()) {
                    view = (View) linkedList.removeLast();
                    listYandexDivPlayerView = !(view instanceof ListYandexDivPlayerView) ? (ListYandexDivPlayerView) view : null;
                    if (listYandexDivPlayerView == null) {
                        listYandexDivPlayerView = new ListYandexDivPlayerView(applicationContext, (AttributeSet) this.j.getValue(), 0, 4, null);
                    }
                }
            }
            view = null;
            if (!(view instanceof ListYandexDivPlayerView)) {
            }
            if (listYandexDivPlayerView == null) {
            }
        }
        listYandexDivPlayerView.setOnDetachCallback(new ListYandexPlayerDivFactory$makePlayerView$1(this));
        this.f.add(listYandexDivPlayerView);
        return listYandexDivPlayerView;
    }

    @Override // defpackage.u4l
    public final r4l b(List list, v4l v4lVar) {
        return new zty(list, v4lVar, (ListYandexPlayer) tje.Y(EmptyCoroutineContext.a, new ListYandexPlayerDivFactory$makePlayer$player$1(this, null)), this.c, this.d.m());
    }
}
