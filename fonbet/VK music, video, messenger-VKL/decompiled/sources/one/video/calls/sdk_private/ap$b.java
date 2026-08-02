package one.video.calls.sdk_private;

/* compiled from: QuicConstants.java */
/* loaded from: classes8.dex */
public enum ap$b {
    original_destination_connection_id(0),
    max_idle_timeout(1),
    stateless_reset_token(2),
    max_udp_payload_size(3),
    initial_max_data(4),
    initial_max_stream_data_bidi_local(5),
    initial_max_stream_data_bidi_remote(6),
    initial_max_stream_data_uni(7),
    initial_max_streams_bidi(8),
    initial_max_streams_uni(9),
    ack_delay_exponent(10),
    max_ack_delay(11),
    disable_active_migration(12),
    preferred_address(13),
    active_connection_id_limit(14),
    initial_source_connection_id(15),
    retry_source_connection_id(16),
    version_information(17);

    public final int s;

    ap$b(int i) {
        this.s = i;
    }
}
