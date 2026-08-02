package com.vk.writebar;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import com.vk.permission.PermissionHelper;
import com.vkontakte.android.R;
import xsna.bpn0;
import xsna.bwt0;
import xsna.e3m;
import xsna.enj;
import xsna.g1s0;
import xsna.h1y0;
import xsna.qah0;
import xsna.rmt0;
import xsna.zq5;

/* compiled from: WriteBarAudioHolder.kt */
/* loaded from: classes7.dex */
public final class d implements View.OnTouchListener {
    public final zq5 b;
    public boolean c;
    public final /* synthetic */ g d;

    public d(g gVar) {
        this.d = gVar;
        this.b = new zq5(8, this, gVar);
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        g gVar = this.d;
        WriteBar writeBar = gVar.b;
        WriteBar writeBar2 = gVar.a;
        ImageView sendButton = writeBar.getSendButton();
        if (bwt0.K(sendButton)) {
            sendButton.performClick();
            return false;
        }
        gVar.g();
        a aVar = gVar.o;
        if (aVar == null) {
            aVar = null;
        }
        if (aVar.d()) {
            a aVar2 = gVar.o;
            if (aVar2 == null) {
                aVar2 = null;
            }
            View view2 = aVar2.p;
            if (view2 != null) {
                view2.dispatchTouchEvent(motionEvent);
            }
        }
        int action = motionEvent.getAction();
        int i = 1;
        if (action != 0) {
            if (action == 1 || action == 3) {
                if (this.c) {
                    this.c = false;
                    gVar.f = true;
                    gVar.b.l0();
                    h1y0 h1y0Var = gVar.d;
                    if (h1y0Var != null) {
                        h1y0Var.c(false);
                    }
                }
                a aVar3 = gVar.o;
                if (aVar3 == null) {
                    aVar3 = null;
                }
                if (!aVar3.d()) {
                    a aVar4 = gVar.o;
                    (aVar4 != null ? aVar4 : null).B = new qah0(gVar, 28);
                }
            }
            return false;
        }
        a aVar5 = gVar.o;
        (aVar5 != null ? aVar5 : null).A.set(motionEvent.getRawX(), motionEvent.getRawY());
        Context context = writeBar2.getContext();
        rmt0 rmt0Var = new rmt0(i, this, gVar);
        PermissionHelper permissionHelper = PermissionHelper.a;
        permissionHelper.getClass();
        String[] strArr = PermissionHelper.j;
        bpn0 bpn0Var = enj.a;
        if (PermissionHelper.p(e3m.h(context), strArr) != PermissionHelper.PermissionResult.ALLOWED) {
            permissionHelper.d(e3m.h(context), strArr, R.string.vkim_permissions_microphone, R.string.vkim_permissions_microphone, rmt0Var, new g1s0(9));
            this.c = false;
            return false;
        }
        this.c = false;
        zq5 zq5Var = this.b;
        writeBar2.removeCallbacks(zq5Var);
        writeBar2.postDelayed(zq5Var, 200L);
        this.c = true;
        return false;
    }
}
