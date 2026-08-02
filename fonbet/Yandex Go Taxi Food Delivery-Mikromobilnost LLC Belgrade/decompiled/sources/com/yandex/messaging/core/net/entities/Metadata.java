package com.yandex.messaging.core.net.entities;

import com.squareup.moshi.Json;
import defpackage.cex;
import defpackage.xuf0;

/* loaded from: classes15.dex */
public class Metadata {

    @Json(name = "allow_unsafe_miniapp")
    public Boolean allowUnsafeMiniapp;

    @Json(name = "calls")
    public CallsSettings callsSettings;

    @Json(name = "chatbar")
    public Chatbar chatbar;

    @Json(name = "complain_action")
    public String[] complainAction;

    @Json(name = "miniapp_url")
    public String miniappUrl;

    @Json(name = "view_importants_list")
    public boolean viewImportantsList = true;

    public static class CallsSettings {

        @Json(name = "may_call")
        @xuf0(tag = 1)
        public boolean canCall;

        @Json(name = "skip_feedback")
        @xuf0(tag = 2)
        public boolean skipFeedback;
    }

    public static class Chatbar {

        @Json(name = "button")
        @xuf0(tag = 4)
        public ChatbarButton button;

        @Json(name = "img")
        @xuf0(tag = 3)
        public String img;

        @Json(name = "subtitle")
        @xuf0(tag = 2)
        public Text subtitle;

        @cex
        @Json(name = "title")
        @xuf0(tag = 1)
        public Text title;
    }

    public static class ChatbarButton {

        @Json(name = "bg_color")
        @xuf0(tag = 4)
        public String bgColor;

        @cex
        @Json(name = "links")
        @xuf0(tag = 2)
        public String[] links;

        @Json(name = "text_color")
        @xuf0(tag = 3)
        public String textColor;

        @cex
        @Json(name = "title")
        @xuf0(tag = 1)
        public Text title;
    }

    public static class Text {

        @Json(name = "i18n_key")
        @xuf0(tag = 2)
        public String locKey;

        @cex
        @Json(name = "text")
        @xuf0(tag = 1)
        public String text;
    }
}
