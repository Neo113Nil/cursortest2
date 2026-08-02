package ru.mail.libverify.api.common;

/* loaded from: classes9.dex */
public enum Status {
    OK,
    ERROR,
    VERIFIED,
    UNSUPPORTED_NUMBER,
    INCORRECT_PHONE_NUMBER,
    PHONE_NUMBER_IN_BLACK_LIST,
    PHONE_NUMBER_TYPE_NOT_ALLOWED,
    RATELIMIT,
    ATTEMPTLIMIT,
    NOT_ENOUGH_DATA,
    UNKNOWN
}
