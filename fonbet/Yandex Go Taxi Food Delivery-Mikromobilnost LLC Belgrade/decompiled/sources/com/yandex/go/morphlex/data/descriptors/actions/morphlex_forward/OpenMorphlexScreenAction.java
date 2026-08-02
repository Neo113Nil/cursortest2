package com.yandex.go.morphlex.data.descriptors.actions.morphlex_forward;

import com.yandex.go.morphlex.data.dto.MorphlexDimension;
import com.yandex.go.morphlex.data.dto.MorphlexScreenPresentType;
import defpackage.gsq0;
import defpackage.i3y;
import defpackage.kr;
import defpackage.y570;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.EmptyList;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/morphlex/data/descriptors/actions/morphlex_forward/OpenMorphlexScreenAction;", "Lkr;", "Companion", "$serializer", "com/yandex/go/morphlex/data/descriptors/actions/morphlex_forward/a", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class OpenMorphlexScreenAction extends kr {
    public static final a Companion = new a();
    public static final i3y[] j;
    public final String a;
    public final String b;
    public final List c;
    public final String d;
    public final MorphlexScreenPresentType e;
    public final Boolean f;
    public final MorphlexDimension g;
    public final boolean h;
    public final String i;

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        j = new i3y[]{null, null, kotlin.a.b(lazyThreadSafetyMode, new y570(3)), null, kotlin.a.b(lazyThreadSafetyMode, new y570(4)), null, null, null, null};
    }

    public /* synthetic */ OpenMorphlexScreenAction(int i, String str, String str2, List list, String str3, MorphlexScreenPresentType morphlexScreenPresentType, Boolean bool, MorphlexDimension morphlexDimension, boolean z, String str4) {
        if ((i & 1) == 0) {
            this.a = "";
        } else {
            this.a = str;
        }
        if ((i & 2) == 0) {
            this.b = "";
        } else {
            this.b = str2;
        }
        if ((i & 4) == 0) {
            this.c = EmptyList.a;
        } else {
            this.c = list;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = str3;
        }
        if ((i & 16) == 0) {
            this.e = MorphlexScreenPresentType.UNSUPPORTED;
        } else {
            this.e = morphlexScreenPresentType;
        }
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = bool;
        }
        if ((i & 64) == 0) {
            this.g = null;
        } else {
            this.g = morphlexDimension;
        }
        if ((i & 128) == 0) {
            this.h = false;
        } else {
            this.h = z;
        }
        if ((i & 256) == 0) {
            this.i = null;
        } else {
            this.i = str4;
        }
    }

    public OpenMorphlexScreenAction() {
        MorphlexScreenPresentType morphlexScreenPresentType = MorphlexScreenPresentType.UNSUPPORTED;
        this.a = "";
        this.b = "";
        this.c = EmptyList.a;
        this.d = null;
        this.e = morphlexScreenPresentType;
        this.f = null;
        this.g = null;
        this.h = false;
        this.i = null;
    }
}
