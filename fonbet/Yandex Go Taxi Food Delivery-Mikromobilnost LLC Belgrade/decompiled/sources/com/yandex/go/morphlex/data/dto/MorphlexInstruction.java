package com.yandex.go.morphlex.data.dto;

import defpackage.gsq0;
import defpackage.i3y;
import defpackage.um20;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/morphlex/data/dto/MorphlexInstruction;", "", "Companion", "$serializer", "com/yandex/go/morphlex/data/dto/b", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class MorphlexInstruction {
    public static final b Companion = new b();
    public static final i3y[] c = {kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new um20(20)), null};
    public final MorphlexScreenInstructionType a;
    public final boolean b;

    public /* synthetic */ MorphlexInstruction(int i, MorphlexScreenInstructionType morphlexScreenInstructionType, boolean z) {
        this.a = (i & 1) == 0 ? MorphlexScreenInstructionType.UNSUPPORTED : morphlexScreenInstructionType;
        if ((i & 2) == 0) {
            this.b = false;
        } else {
            this.b = z;
        }
    }

    public MorphlexInstruction() {
        this.a = MorphlexScreenInstructionType.UNSUPPORTED;
        this.b = false;
    }
}
