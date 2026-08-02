package com.yandex.fintechsdk.adapters.flex.sdk.impl.flex.navigation;

import defpackage.kr;
import defpackage.nh5;
import defpackage.o3l0;
import defpackage.u1m;
import defpackage.ug5;
import defpackage.ywl;
import java.util.Map;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\b`\u0018\u00002\u00020\u00012\u00020\u0002J\u000f\u0010\u0004\u001a\u00020\u0003H&¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H&¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/yandex/fintechsdk/adapters/flex/sdk/impl/flex/navigation/FlexRouteHandler;", "Lo3l0;", "Lnh5;", "Lzy11;", "reloadCurrentDocument", "()V", "Lkr;", "action", "", "dispatchActionOnCurrent", "(Lkr;)Z", "impl-18-1-0_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes10.dex */
public interface FlexRouteHandler extends o3l0, nh5 {
    /* bridge */ /* synthetic */ default boolean attachChildRouteHandler(int i, int i2) {
        return false;
    }

    @Override // defpackage.o3l0, defpackage.nh5
    /* synthetic */ boolean backward(boolean z, Map map);

    /* bridge */ /* synthetic */ default boolean detachChildRouteHandler() {
        return false;
    }

    @Override // defpackage.o3l0
    /* synthetic */ boolean dismiss(boolean z, kr krVar, Map map);

    boolean dispatchActionOnCurrent(kr action);

    @Override // defpackage.o3l0
    /* synthetic */ boolean forward(u1m u1mVar, ywl ywlVar, boolean z, Map map);

    @Override // defpackage.nh5
    /* synthetic */ int getBackStackEntryCount();

    @Override // defpackage.nh5
    /* synthetic */ ug5 getCurrentFragmentQuery();

    @Override // defpackage.o3l0, defpackage.nh5
    /* synthetic */ boolean hideOverlay(String str, boolean z, Map map);

    @Override // defpackage.o3l0
    /* synthetic */ boolean overlay(u1m u1mVar, ywl ywlVar, boolean z, boolean z2, Map map);

    @Override // defpackage.nh5
    /* synthetic */ void popToRoot(boolean z);

    void reloadCurrentDocument();

    @Override // defpackage.o3l0
    /* synthetic */ boolean showOverlay(String str, ywl ywlVar, Map map);

    @Override // defpackage.o3l0
    /* synthetic */ boolean showPopup(u1m u1mVar, ywl ywlVar, boolean z, boolean z2, boolean z3, boolean z4, Float f, boolean z5, Map map, kr krVar);
}
