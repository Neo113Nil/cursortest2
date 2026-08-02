package org.chromium.net.httpflags;

import com.google.protobuf.MessageLiteOrBuilder;
import java.util.Map;

/* loaded from: classes11.dex */
public interface FlagsOrBuilder extends MessageLiteOrBuilder {
    boolean containsFlags(String str);

    @Deprecated
    Map<String, FlagValue> getFlags();

    int getFlagsCount();

    Map<String, FlagValue> getFlagsMap();

    FlagValue getFlagsOrDefault(String str, FlagValue flagValue);

    FlagValue getFlagsOrThrow(String str);
}
