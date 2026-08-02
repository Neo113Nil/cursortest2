package com.yandex.runtime.logging;

import com.yandex.runtime.bindings.Archive;
import com.yandex.runtime.bindings.Serializable;
import defpackage.ny61;

/* loaded from: classes2.dex */
public class LogMessage implements Serializable {
    private LogLevel level;
    private String message;
    private String scope;
    private long time;
    private String verboseInfo;

    public enum LogLevel {
        ERROR,
        WARNING,
        INFO,
        DEBUG
    }

    public LogMessage(long j, LogLevel logLevel, String str, String str2, String str3) {
        if (logLevel == null) {
            ny61.g("Required field \"level\" cannot be null");
            throw null;
        }
        if (str == null) {
            ny61.g("Required field \"scope\" cannot be null");
            throw null;
        }
        if (str2 == null) {
            ny61.g("Required field \"message\" cannot be null");
            throw null;
        }
        if (str3 == null) {
            ny61.g("Required field \"verboseInfo\" cannot be null");
            throw null;
        }
        this.time = j;
        this.level = logLevel;
        this.scope = str;
        this.message = str2;
        this.verboseInfo = str3;
    }

    public LogLevel getLevel() {
        return this.level;
    }

    public String getMessage() {
        return this.message;
    }

    public String getScope() {
        return this.scope;
    }

    public long getTime() {
        return this.time;
    }

    public String getVerboseInfo() {
        return this.verboseInfo;
    }

    @Override // com.yandex.runtime.bindings.Serializable
    public void serialize(Archive archive) {
        this.time = archive.add(this.time);
        this.level = (LogLevel) archive.add((Archive) this.level, false, (Class<Archive>) LogLevel.class);
        this.scope = archive.add(this.scope, false);
        this.message = archive.add(this.message, false);
        this.verboseInfo = archive.add(this.verboseInfo, false);
    }

    public LogMessage() {
    }
}
