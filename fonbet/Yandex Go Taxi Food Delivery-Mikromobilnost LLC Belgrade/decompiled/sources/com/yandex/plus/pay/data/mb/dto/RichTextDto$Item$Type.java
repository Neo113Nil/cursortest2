package com.yandex.plus.pay.data.mb.dto;

import defpackage.gsq0;
import defpackage.i3y;
import defpackage.k4o;
import defpackage.o3k0;
import defpackage.zfj0;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@gsq0
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\u0081\u0002\u0018\u0000 \u00032\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"com/yandex/plus/pay/data/mb/dto/RichTextDto$Item$Type", "", "Lcom/yandex/plus/pay/data/mb/dto/RichTextDto$Item$Type;", "Companion", "o3k0", "LINK", "HIGHLIGHT", "STRIKE", "pay-sdk-data-mediabilling-model_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class RichTextDto$Item$Type {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ RichTextDto$Item$Type[] $VALUES;
    private static final i3y $cachedSerializer$delegate;
    public static final o3k0 Companion;
    public static final RichTextDto$Item$Type HIGHLIGHT;
    public static final RichTextDto$Item$Type LINK;
    public static final RichTextDto$Item$Type STRIKE;

    static {
        RichTextDto$Item$Type richTextDto$Item$Type = new RichTextDto$Item$Type("LINK", 0);
        LINK = richTextDto$Item$Type;
        RichTextDto$Item$Type richTextDto$Item$Type2 = new RichTextDto$Item$Type("HIGHLIGHT", 1);
        HIGHLIGHT = richTextDto$Item$Type2;
        RichTextDto$Item$Type richTextDto$Item$Type3 = new RichTextDto$Item$Type("STRIKE", 2);
        STRIKE = richTextDto$Item$Type3;
        RichTextDto$Item$Type[] richTextDto$Item$TypeArr = {richTextDto$Item$Type, richTextDto$Item$Type2, richTextDto$Item$Type3};
        $VALUES = richTextDto$Item$TypeArr;
        $ENTRIES = kotlin.enums.a.a(richTextDto$Item$TypeArr);
        Companion = new o3k0();
        $cachedSerializer$delegate = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new zfj0(18));
    }

    public static RichTextDto$Item$Type valueOf(String str) {
        return (RichTextDto$Item$Type) Enum.valueOf(RichTextDto$Item$Type.class, str);
    }

    public static RichTextDto$Item$Type[] values() {
        return (RichTextDto$Item$Type[]) $VALUES.clone();
    }
}
