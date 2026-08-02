package com.yandex.passport.internal.ui.social.gimap;

import com.yandex.passport.data.exceptions.FailedResponseException;

/* loaded from: classes8.dex */
public class ExtAuthFailedException extends FailedResponseException {
    public final b serversHint;
    public final MailProvider suggestedProvider;

    public ExtAuthFailedException(String str, b bVar, MailProvider mailProvider) {
        super(str);
        this.serversHint = bVar;
        this.suggestedProvider = mailProvider;
    }
}
